import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
    //Diferencia entre el uso de ArrayList y LinkedList.
    // La principal diferencia es la forma en que se guardan los elementos. En un ArrayList, los elementos se almacenan en un array
    // y en una LinkedList, cada elemento contiene un puntero al siguiente elemento de la lista.
    // En el caso de ArrayList, esta es una estructura que almacena los elementos de forma contigua en un array en la memoria. El acceso
    // a elementos individuales es muy rápido, pero las operaciones de agregar y eliminar sean más lentas que en LinkedList.
    // En caso de LinkedList, el acceso a elementos individuales  es más lento que en ArrayList porque los elementos no se almacenan
    // de forma contigua en la memoria.

    //Consumo de memoria.
    // El ArrayList es más eficiente que LinkedList en la mayoría de los casos porque almacena los
    // elementos en un arreglo contiguo en la memoria y permite un acceso rápido y eficiente a los datos, porque
    // la LinkedList tiene los nodos.
    // Pero realmente la eficiencia depende de qué querramos hacer, por ejemplo en este caso nos conviene más usar LinkedList-
    // en un ArrayList, cuando se elimina un elemento, se tiene que reorganizar todos los elementos de la lista para llenar el espacio vacío.
    // Esto puede ser costoso en términos de tiempo de ejecución, sobre todo si la lista es muy grande.
    public ArrayList<Sucursal> listaSucursales = new ArrayList<>();
    public Empresa(String Nombre){
        this.nombre = Nombre;
    }

    String nombre;

    //Agregar sucursales: tiempo de ejecución O(n)
    public void agregarSucursales(String archivo){
        String[] sucursalesStr = Lector.leerArchivo(archivo);
        for (int s = 0; s < sucursalesStr.length; s++) { //O(n), n es el numero de sucursales del archivo de entrada
            Sucursal sucu = new Sucursal(sucursalesStr[s]);
            listaSucursales.add(sucu);
        }
    }
    //Buscar sucursal: tiempo de ejecución O(n)
    public Sucursal buscarSucursal(String ubicacion) {
        for (Sucursal sucu : listaSucursales) { //O(n), n es el número de sucursales en la listaSucursales.
            if (sucu.getUbicacion().equals(ubicacion))
            {
                System.out.println("La sucursal fue encontrada.");
                return sucu;
            }
        }
        System.out.println("La sucursal no fue encontrada.");
        return null;
    }
    // eliminarSucursales: tiempo de ejecución 0(n)
    public void eliminarSucursales(String ubicacion) {
        for (int i = 0; i < listaSucursales.size(); i++) { //En el peor caso O(n), n es el número de sucursales en la listaSucursales.
            Sucursal sucu = listaSucursales.get(i);
            if (sucu.getUbicacion().equals(ubicacion))
            {
                listaSucursales.remove(i);
                break;
            }
        }
    }
    //mostrar sucursales: tiempo de ejecución O(n)
    public String mostrarSucursales(){
        String[] sucu = new String[listaSucursales.size()];
        for (int i = 0; i < listaSucursales.size(); i++) { //En el peor caso O(n), n es el número de sucursales en la listaSucursales.
            String proc = "Sucursal: " + listaSucursales.get(i).getUbicacion();
            sucu[i] = proc;
        }
        return Arrays.toString(sucu);
    }
    //imprimir: tiempo de ejecución O(n)
    public String imprimir(String separador){
        String[] sucu = new String[listaSucursales.size()];
        for (int i = 0; i < listaSucursales.size(); i++) { //En el peor caso O(n), n es el número de sucursales en la listaSucursales.
            String proc = listaSucursales.get(i).getUbicacion() + separador;
            sucu[i] = proc;
        }
        return Arrays.toString(sucu).replaceAll(",", "");
    }
    //cantidadSucursales: tiempo de ejecucion O(1)
    public int cantidadSucursales(){
        return listaSucursales.size();
    }
    //sucursalesVacio: tiempo de ejecucion O(1)
    public boolean sucursalesVacio(){
        return listaSucursales.isEmpty(); //devuelve el tamaño de la lista, que se guarda en la clase.
    }
}
