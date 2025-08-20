package album;
import java.util.Scanner;

public class Album {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vector para artistas 
        Vector vectorArtistas = new Vector(50); 
        ManejoVector manejadorArtistas = new ManejoVector(); 

        // Vector para canciones 
        Vector vectorCanciones = new Vector(100); 
        ManejoVector manejadorCanciones = new ManejoVector(); 

        System.out.print("¿Cuántos artistas quieres ingresar?: ");
        int nA = sc.nextInt();

        // === Ciclo para ingresar artistas ===
        for (int i = 0; i < nA; i++) {
            System.out.println("\n=== Ingreso de Artista " + (i + 1) + " ===");

            Artista artista = new Artista().IngresarDatos();  
            manejadorArtistas.agregar(vectorArtistas, artista);

            System.out.print("¿Cuántas canciones tiene este artista?: ");
            int nC = sc.nextInt();

            // === Ciclo para ingresar canciones ===
            for (int j = 0; j < nC; j++) {
                System.out.println("\n   --- Ingreso de Canción " + (j + 1) + " ---");

                Cancion cancion = new Cancion().IngresarDatos(artista.getCodigo());
                manejadorCanciones.agregar(vectorCanciones, cancion);
            }
        }

        // === Mostrar artistas ===
        System.out.println("\n=== ARTISTAS REGISTRADOS ===");
        for (int i = 0; i < manejadorArtistas.tamaño(); i++) {
            Artista a = (Artista) manejadorArtistas.obtener(vectorArtistas, i);
            System.out.println(a);
        }

        // === Mostrar canciones ===
        System.out.println("\n=== CANCIONES REGISTRADAS ===");
        for (int i = 0; i < manejadorCanciones.tamaño(); i++) {
            Cancion c = (Cancion) manejadorCanciones.obtener(vectorCanciones, i);
            System.out.println(c);
        }
    }
}
