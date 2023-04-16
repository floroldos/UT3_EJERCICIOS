
//Crear los elementos y la lista - pronto
//• Insertar un elemento en una lista (al final, la lista no está ordenada) - pronto
//• Buscar un elemento en una lista - pronto
//• Listar (imprimir) todos los elementos de una lista
//• Eliminar un elemento de una lista, dada su clave.
public class Main {
    public static void main(String[] args) {
        //Crear lista con sus elementos. En este caso es una lista de nros. enteros.
        Lista<Integer> listaNueva = new Lista<>();
        Nodo<Integer> nuevoNodo = new Nodo<>(5, 5);
        Nodo<Integer> nuevoNodo2 =new Nodo<>(4,4);
        Nodo<Integer> nuevoNodo3 =new Nodo<>(1,1);

        listaNueva.insertar(nuevoNodo);
        listaNueva.insertar(nuevoNodo2);
        listaNueva.insertar(nuevoNodo3);

        //Buscar elemento en la lista. Se notifica si se encuentra o no el elemento.
        Nodo<Integer> nodoEncontrado = listaNueva.buscar(3);
        if (nodoEncontrado != null) {
            System.out.println("Se encontró el nodo especificado.");
        } else {
            System.out.println("No se encontró el nodo especificado.");
        }
        //Elimina el nodo especificado
        listaNueva.eliminar(4);
        //Imprime la lista de nodos en pantalla
        listaNueva.imprimir();
    }
}