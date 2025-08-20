package album;

public class Album {

    public static void main(String[] args) {

        ManejoVector manejadorArtistas = new ManejoVector();
        ManejoVector manejadorCanciones = new ManejoVector();

        Vector vectorArtistas = new Vector(100);   // máximo 100 artistas
        Vector vectorCanciones = new Vector(500);  // máximo 500 canciones

        int opMP;

        do {
            opMP = Validaciones.LeerInt(
                    "--------MENU PRINCIPAL--------\n" +
                    "1. Ingresar Artista\n" +
                    "2. Ingresar Cancion\n" +
                    "3. Ver Artistas\n" +
                    "4. Ver Canciones\n" +
                    "5. Mostrar Artista Segun Nacionalidad\n" +
                    "6. Ver Canciones con Calificacion 5,0\n" +
                    "7. Mostrar Artistas con Mayor #Canciones\n" +
                    "10. SALIR\n");

            switch (opMP) {
                case 1:
                    int nA = Validaciones.LeerInt("Cuantos Artistas Desea Ingresar? ");
                    for (int i = 0; i < nA; i++) {
                        System.out.println("\n=== Ingreso de Artista " + (i + 1) + " ===");
                        Artista artista = new Artista().IngresarDatos();
                        manejadorArtistas.agregar(vectorArtistas, artista);
                        System.out.println("=== ARTISTA INGRESADO CORRECTAMENTE ===");
                    }
                    break;

                case 2:
                    if (vectorArtistas.tamaño() == 0) {
                        System.out.println("Primero debe ingresar artistas antes de registrar canciones.");
                        break;
                    }

                    int codArts = Validaciones.LeerInt("Ingrese el Codigo del Artista para Agregar Cancion: ");
                    Artista objA = manejadorArtistas.buscarPorCodigo(vectorArtistas, codArts);

                    if (objA == null) {
                        System.out.println("ARTISTA NO ENCONTRADO");
                        break;
                    }

                    int nC = Validaciones.LeerInt("Cuantas Canciones Tiene el Artista? ");
                    for (int j = 0; j < nC; j++) {
                        System.out.println("\n--- Ingreso de Canción " + (j + 1) + " ---");
                        Cancion cancion = new Cancion().IngresarDatos(objA.getCodigo());
                        manejadorCanciones.agregar(vectorCanciones, cancion);
                        System.out.println("=== CANCION INGRESADA CORRECTAMENTE ===");
                    }
                    break;

                case 3:
                    System.out.println("\n=== ARTISTAS REGISTRADOS ===");
                    if (vectorArtistas.tamaño() == 0) {
                        System.out.println("No hay artistas registrados.");
                    } else {
                        for (int i = 0; i < vectorArtistas.tamaño(); i++) {
                            Artista a = (Artista) manejadorArtistas.obtener(vectorArtistas, i);
                            System.out.println(a + "\n");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== CANCIONES REGISTRADAS ===");
                    if (vectorCanciones.tamaño() == 0) {
                        System.out.println("No hay canciones registradas.");
                    } else {
                        for (int i = 0; i < vectorCanciones.tamaño(); i++) {
                            Cancion c = (Cancion) manejadorCanciones.obtener(vectorCanciones, i);
                            System.out.println(c + "\n");
                        }
                    }
                    break;

                case 10:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opMP != 10);
        
        //ejemplo para los ....
    }
}
