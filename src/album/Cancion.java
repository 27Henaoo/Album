
package album;
import java.util.Scanner;
public class Cancion extends Artista{
    
    private String Nombre;
    private String Año;
    private int Clasificacion;

    public Cancion() {
        super();
    }

    public Cancion(String CodigoArtista, String Nombre, String Año, int Clasificacion) {
        super.setCodigo(Codigo);
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
        
        System.out.println("Ingrese la Clasificacion de la Cancion: ");
        Clasificacion = sc.nextInt();
        
       return new Cancion(CodigoArtista, Nombre, Año, Clasificacion);
    }

    
    @Override
    public String toString() {
        return "Cancion{" + "Codigo Artista: " + getCodigo() + "Nombre=" + Nombre + ", A\u00f1o=" + Año + ", Clasificacion=" + Clasificacion + '}';
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

    public int getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(int Clasificacion) {
        this.Clasificacion = Clasificacion;
    }
    
    
}
