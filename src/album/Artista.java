
package album;
import java.util.Scanner;

public class Artista 
{
    protected int Codigo; //Try
    private String Nombre;//Try
    private String Nacionalidad;//Try
    private int añosCarrera;//Try

    public Artista() {
    }

    public Artista(int Codigo, String Nombre, String Nacionalidad, int añosCarrera) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.añosCarrera = añosCarrera;
    }
    
    public Artista IngresarDatos()
    {
        Scanner sc = new Scanner(System.in);
        
        
        Codigo = Validaciones.LeerInt("Ingrese el Codigo del Artista:" );
        
        Nombre = Validaciones.LeerString("Ingrese el Nombre del Artista: ");
        
        Nacionalidad = Validaciones.LeerString("Ingrese la Nacionalidad del Artista: ");
        
        añosCarrera = Validaciones.LeerInt("Ingrese Años de Carrera del Artista: ");
        
        return new Artista(Codigo, Nombre, Nacionalidad, añosCarrera);
    }

    @Override
    public String toString() {
        return "Artista{" + "Codigo=" + Codigo + ", Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", a\u00f1osCarrera=" + añosCarrera + '}';
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
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

    public int getAñosCarrera() {
        return añosCarrera;
    }

    public void setAñosCarrera(int añosCarrera) {
        this.añosCarrera = añosCarrera;
    }

  

}
