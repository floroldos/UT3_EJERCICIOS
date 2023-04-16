public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (primero == null)
            primero = nodo;
        else {
            Nodo temporal = primero;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nodo);
        }
    }

    @Override
    public void insertar(Comparable etiqueta, T dato) {

    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo temporal = primero;
        while (temporal != null) {
            if (clave.compareTo(temporal.getEtiqueta()) == 0)
                return temporal;
            temporal = temporal.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        Nodo<T> actual = primero;
        Nodo<T> anterior = null;

        while (actual != null && actual.getEtiqueta().compareTo(clave) != 0) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        // Si no se encuentra el nodo, retornamos false
        if (actual == null) {
            return false;
        } else if (anterior == null) {
            primero = actual.getSiguiente();
        } else {
            anterior.setSiguiente(actual.getSiguiente());
        }
        return true;
    }

    @Override
    public String imprimir() {
        String lista = "";
        Nodo<T> temporal = primero;
        while (temporal != null) {
            System.out.println(temporal.getDato());
            temporal = temporal.getSiguiente();
        }
        return lista.toString();
    }

    @Override
    public String imprimir(String separador) {
        return null;
    }

    @Override
    public int cantElementos() {
        return 0;
    }

    @Override
    public boolean esVacia() {
        return false;
    }

    @Override
    public void setPrimero(Nodo<T> unNodo) {

    }
}