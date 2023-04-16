public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    @Override
    public void insertar(Nodo<T> nodo) {
        if (primero == null)
            primero = nodo;
        else{
            Nodo temporal =  primero;
            while (temporal.getSiguiente() != null){
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        Nodo temporal = primero;
        while (temporal != null){
            if (clave.compareTo(temporal.getEtiqueta()) == 0)
                return temporal;
            temporal = temporal.getSiguiente();
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        return false;
    }

    @Override
    public String imprimir() {
        return null;
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
