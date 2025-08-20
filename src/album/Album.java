package album;
import java.util.Scanner;

public class Album {
    public static void main(String[] args) 
    {
          Scanner sc = new Scanner(System.in);

            ManejoVector manejadorArtistas = new ManejoVector();
            ManejoVector manejadorCanciones = new ManejoVector();

            Vector vectorArtistas = null;   // aún no creado
            Vector vectorCanciones = null;  // aún no creado
            //objetos para recibir retornos
        
            Artista objA=new Artista();
            Cancion objc=new Cancion();
       
        
        int opMP;
        
        do{//Mientras Menu Principal
            
            opMP = Validaciones.LeerInt("--------MENU PRINCIPAL--------\n"
                    + "1. Ingresar Artista\n"
                    + "2. Ingresar Cancion\n"
                    + "3. Ver Artistas\n"
                    + "4. Ver Canciones\n"
                    + "5. Buscar Artista por Nacionalidad\n"
                    + "6. Cancion con Puntuacion de 5,0\n"
                    + "7. Artista con Mayor # de Canciones\n"
                    + "10. SALIR\n");
            
            switch(opMP){
                    
                case 1: 
                            
                            int nA = Validaciones.LeerInt("Cuantos Artistas Desea Ingresar?");
                            vectorArtistas = new Vector(nA);
                            
                            

                            // === Ciclo para ingresar artistas ===
                            for (int i = 0; i < nA; i++) 
                            {
                                System.out.println("\n=== Ingreso de Artista " + (i + 1) + " ===");

                                Artista artista = new Artista().IngresarDatos();  
                                manejadorArtistas.agregar(vectorArtistas, artista);
                                System.out.println("\n=== ARTISTA INGRESADO CORRECTAMENTE " + (i + 1) + " ===");
                            }
                            break;
                case 2:
                           
                           if (vectorArtistas == null) {
                             System.out.println("Primero debe ingresar artistas antes de registrar canciones.");
                              break;
                            }
                           
                              
                            int codArts = Validaciones.LeerInt("Ingrese el Codigo del Artista para Agregar Cancion: ");
                            
                            
                            int nC = Validaciones.LeerInt("Cuantas Canciones Tiene el Artista?");
                            
                            
                                                        // === Ciclo para ingresar canciones ===
                            for (int j = 0; j < nC; j++) 
                            {
                                if (manejadorArtistas.existeCodigo(vectorArtistas, codArts) == true) 
                                {
                                    
                                    System.out.println("\n   --- Ingreso de Canción " + (j + 1) + " ---");
                                    Cancion cancion = new Cancion().IngresarDatos(objA.getCodigo());
                                    manejadorCanciones.agregar(vectorCanciones, cancion);
                                    System.out.println("\n=== CANCION INGRESADA CORRECTAMENTE " + (j + 1) + " ===");
                                    
                                } 
                                
                                else 
                                {
                                    System.out.println("ARTISTA NO ENCONTRADO");
                                }

                             }

                           
                            
                            break;
                case 3:
                             // === Mostrar artistas ===
                            System.out.println("\n=== ARTISTAS REGISTRADOS ===");
                            for (int i = 0; i < manejadorArtistas.tamaño(); i++) 
                            {
                                Artista a = (Artista) manejadorArtistas.obtener(vectorArtistas, i);
                                System.out.println(a);
                                System.out.println("\n");
                            }
                            break;
                case 4:
                            // === Mostrar canciones ===
                            System.out.println("\n=== CANCIONES REGISTRADAS ===");
                            for (int i = 0; i < manejadorCanciones.tamaño(); i++) 
                            {
                                Cancion c = (Cancion) manejadorCanciones.obtener(vectorCanciones, i);
                                System.out.println(c);
                            }
                            break;
                    
                            
                            
                            


        }
                
            
            
        }while (opMP < 10);
        
        
        
        
       




    }
}
