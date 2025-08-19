
package album;
import java.util.Scanner;

public class Artista 
{
    protected String Codigo;
    private String Nombre;
    private String Nacionalidad;
    private String añosCarrera;

    public Artista() {
    }

    public Artista(String Codigo, String Nombre, String Nacionalidad, String añosCarrera) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.añosCarrera = añosCarrera;
    }
    
    public Artista IngresarDatos()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el Codigo del Artista: ");
        Codigo = sc.next();
        
        System.out.println("Ingrese el Nombre del Artista: ");
        Nombre = sc.next();
        
        System.out.println("Ingrese el Nacionalidad del Artista: ");
        Nacionalidad = sc.next();
        
        System.out.println("Ingrese Años de Carrera del Artista: ");
        añosCarrera = sc.next();
        
        return new Artista(Codigo, Nombre, Nacionalidad, añosCarrera);
    }

    @Override
    public String toString() {
        return "Artista{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", a\u00f1osCarrera=" + añosCarrera + '}';
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getAñosCarrera() {
        return añosCarrera;
    }

    public void setAñosCarrera(String añosCarrera) {
        this.añosCarrera = añosCarrera;
    }

}
