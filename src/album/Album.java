package album;

import java.util.Scanner;

public class Album {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vector para artistas 
        Vector vectorArtistas = new Vector(50); // Se crea un vector de 50 posiciones
        ManejoVector manejadorArtistas = new ManejoVector(); // Manejador de artistas

        // Vector para canciones 
        Vector vectorCanciones = new Vector(100); // Se crea un vector de 100 posiciones
        ManejoVector manejadorCanciones = new ManejoVector(); // Manejador de canciones

        System.out.print("¿Cuántos artistas quieres ingresar?: ");
        int nA = sc.nextInt(); // Número de artistas a ingresar

        // === Ciclo para ingresar artistas ===
        for (int i = 0; i < nA; i++) {
            System.out.println("\n=== Ingreso de Artista " + (i + 1) + " ===");

            // Se pide el ingreso de datos del artista
            Artista artista = new Artista().IngresarDatos();  
            manejadorArtistas.agregar(vectorArtistas, artista); // Se agrega el artista al vector

            System.out.print("¿Cuántas canciones tiene este artista?: ");
            int nC = sc.nextInt(); // Número de canciones del artista

            // === Ciclo para ingresar canciones ===
            for (int j = 0; j < nC; j++) {
                System.out.println("\n   --- Ingreso de Canción " + (j + 1) + " ---");

                // Se pasa el código del artista a la canción
                Cancion cancion = new Cancion().IngresarDatos(artista.getCodigo());

                // Se agrega la canción al vector de canciones
                manejadorCanciones.agregar(vectorCanciones, cancion);
            }
        }

        // === Mostrar artistas ===
        System.out.println("\n=== ARTISTAS REGISTRADOS ===");
        for (int i = 0; i < manejadorArtistas.tamaño(); i++) {
            Artista a = (Artista) manejadorArtistas.obtener(vectorArtistas, i); // Obtener artista del vector
            System.out.println(a); // Imprimir artista
        }

        // === Mostrar canciones ===
        System.out.println("\n=== CANCIONES REGISTRADAS ===");
        for (int i = 0; i < manejadorCanciones.tamaño(); i++) {
            Cancion c = (Cancion) manejadorCanciones.obtener(vectorCanciones, i); // Obtener canción del vector
            System.out.println(c); // Imprimir canción (incluye el código del artista heredado)
        }
    }
}
