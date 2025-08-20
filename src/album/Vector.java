
package album;

public class Vector {
    
     private Object Vector[];
    private int max; //Capacidad del vector
    private int N; //Total de elemetos del vector

    public Vector() {
    }

    // Constructor con tamaño máximo
    public Vector(int tamaño) 
    {
        this.max = tamaño;
        Vector = new Object[max];
    }

    public Object[] getVector() {
        return Vector;
    }

    public void setVector(Object[] Vector) {
        this.Vector = Vector;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }
    
    //comentario de samuel
    //comentario de Juanes
}
