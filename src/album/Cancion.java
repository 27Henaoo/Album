
package album;
import java.util.Scanner;

public class Cancion {
    private int codigoArtista;
    private String nombre;
    private String año;
    private double clasificacion;

    public Cancion() {}

    public Cancion(int codigoArtista, String nombre, String año, double clasificacion) {
        this.codigoArtista = codigoArtista;
        this.nombre = nombre;
        this.año = año;
        this.clasificacion = clasificacion;
    }

    public Cancion IngresarDatos(int codigoArtista) 
    {
        Scanner sc = new Scanner(System.in);
        
        this.codigoArtista = codigoArtista;

        nombre = Validaciones.LeerString("Ingrese el Nombre de la Cancion: ");
       
        año = Validaciones.LeerString("Ingrese el Año de la Cancion: ");

        do {
            
            clasificacion = Validaciones.LeerDouble("Ingrese la Clasificacion de la Cancion (1,0 a 5,0): ");

            if (clasificacion < 1 || clasificacion > 5) {
                System.out.println(" La clasificacion debe ser de 1,0 a 5,0 Intente nuevamente.");
            }
        } while (clasificacion < 1 || clasificacion > 5);

        return new Cancion(codigoArtista, nombre, año, clasificacion);
    }

    @Override
    public String toString() {
        return "Cancion{" + "codigoArtista=" + codigoArtista + ", nombre=" + nombre + ", a\u00f1o=" + año + ", clasificacion=" + clasificacion + '}';
    }

    public int getCodigoArtista() {
        return codigoArtista;
    }

    public void setCodigoArtista(int codigoArtista) {
        this.codigoArtista = codigoArtista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(double clasificacion) {
        this.clasificacion = clasificacion;
    }

    
}

