
package album;

public class ManejoVector {
    
        private int N; // Número actual de elementos
    
    public ManejoVector() {
        N = 0;
    }
    
    // Agregar elemento
    public void agregar(Vector v, Object elemento) {
        if (N < v.getMax()) {
            v.getVector()[N] = elemento;
            N++;
        } else {
            System.out.println("Vector lleno. No se puede agregar más elementos.");
        }
    }
    
    // Obtener elemento
    public Object obtener(Vector v, int indice) {
        if (indice >= 0 && indice < N) {
            return v.getVector()[indice];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }
    
    // Obtener tamaño actual
    public int tamaño() {
        return N;
    }
    
        // Verifica si un código ya existe
    public boolean existeCodigo(Vector v, String Codigo) {
        for (int i = 0; i < N; i++) {
            Artista artista = (Artista) v.getVector()[i];
            if (artista.getCodigo().equals(Codigo)) 
            {
                return true;
            }
        }
        return false;
    }

}
