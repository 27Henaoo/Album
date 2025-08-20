
package album;
import java.util.Scanner;
public class Cancion extends Artista{
    
    private String Nombre;
    private String Año;
    private double Clasificacion;

    public Cancion() {
        super();
    }

    public Cancion(String CodigoArtista, String Nombre, String Año, double Clasificacion){
        
        super.setCodigo(CodigoArtista);
        this.Nombre = Nombre;
        this.Año = Año;
        this.Clasificacion = Clasificacion;
    }
    
    
    public Cancion IngresarDatos(String CodigoArtista)
    
    {
        Scanner sc = new Scanner(System.in);
        
         this.Codigo = CodigoArtista;
        
        System.out.println("Ingrese el Nombre de la Cancion: ");
        Nombre = sc.next();
        
        System.out.println("Ingrese el Año de la Cancion: ");
        Año = sc.next();
        
    do {
    System.out.println("Ingrese la Clasificacion de la Cancion (1 a 5): ");
    Clasificacion = sc.nextDouble();

    if (Clasificacion < 1 || Clasificacion > 5) {
        System.out.println(" La clasificacion debe ser de 1 a 5. Intente nuevamente.");
    }
} while (Clasificacion < 1 || Clasificacion > 5);
        
        
       return new Cancion(CodigoArtista, Nombre, Año, Clasificacion);
    }

    
    @Override
    public String toString() {
        return "Cancion {" + " Codigo Artista: " + "" + getCodigo() + " Nombre = " + Nombre + ", A\u00f1o = " + Año + ", Clasificacion = " + Clasificacion + '}';
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public double getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(double Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    
    
    
}
