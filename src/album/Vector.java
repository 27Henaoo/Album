package album;

public class Vector {
    
    private Object[] vector;
    private int max; // Capacidad máxima del vector
    private int N;   // Cantidad actual de elementos

    // Constructor con tamaño máximo
    public Vector(int tamaño) {
        this.max = tamaño;
        this.vector = new Object[max];
        this.N = 0;
    }

    // Obtener objeto en posición i
    public Object obtener(int i) {
        if (i >= 0 && i < N) {
            return vector[i];
        } else {
            return null; // índice inválido
        }
    }

    // Agregar objeto al vector
    public boolean agregar(Object obj) {
        if (N < max) {
            vector[N] = obj;
            N++;
            return true;
        } else {
            System.out.println("No hay espacio en el vector.");
            return false;
        }
    }

    // Obtener cantidad de elementos actuales
    public int tamaño() {
        return N;
    }

    // Obtener capacidad máxima
    public int getMax() {
        return max;
    }
}
