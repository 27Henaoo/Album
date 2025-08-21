
package album;

public class ManejoVector {

    // Agregar objeto al vector
    public void agregar(Vector v, Object obj) {
        v.agregar(obj);
    }

    // Obtener objeto en posición i
    public Object obtener(Vector v, int i) {
        return v.obtener(i);
    }

    // Retornar cantidad de elementos
    public int tamaño(Vector v) {
        return v.tamaño();
    }
    
// Verifica si un código de artista ya existe en el vector
public boolean existeCodigo(Vector v, int codigo) {
    // Recorremos todos los elementos actualmente en el vector
    for (int i = 0; i < v.tamaño(); i++) {
        Artista artista = (Artista) v.obtener(i); // usamos el método público obtener()
        if (artista.getCodigo() == codigo) {      // comparación numérica
            return true;                          // el código ya existe
        }
    }
    return false; // no se encontró el código
}


    // Buscar Artista por código
    public Artista buscarPorCodigo(Vector v, int codigo)
    {
        for (int i = 0; i < v.tamaño(); i++) {
            Artista a = (Artista) v.obtener(i);
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }
    // Método para buscar todos los artistas de una nacionalidad
    public Vector buscarPorNacionalidad(Vector v, String nacionalidad) {
        // Crear un vector temporal para guardar los artistas encontrados
        Vector resultado = new Vector(v.tamaño()); // Capacidad máxima = cantidad actual de artistas

        // Normalizamos la nacionalidad buscada
        String busqueda = nacionalidad.trim().toLowerCase();

        // Recorremos todos los elementos válidos del vector
        for (int i = 0; i < v.tamaño(); i++) {
            Artista a = (Artista) v.obtener(i); // usamos el método público
            // Comparamos la nacionalidad del artista con la buscada
            if (a.getNacionalidad().trim().toLowerCase().equals(busqueda)) {
                // Agregamos el artista al vector de resultados
                resultado.agregar(a);
            }
        }

        return resultado; // Retorna vector con artistas encontrados
    }
    
    public Vector BuscarCalificacion5(Vector v)
    {
        
         // Crear un vector temporal para guardar los artistas encontrados
        Vector resultado = new Vector(v.tamaño()); // Capacidad máxima = cantidad actual de artistas
        int busqueda = 5;
        
        for (int i = 0; i < v.tamaño(); i++) 
        {
            Cancion c = (Cancion) v.obtener(i); // usamos el método público
            // Comparamos la nacionalidad del artista con la buscada
            if (c.getClasificacion() == busqueda) 
            {
                // Agregamos el artista al vector de resultados
                resultado.agregar(c);
            }
        
        
         }
         return resultado;
    }    
    
}

