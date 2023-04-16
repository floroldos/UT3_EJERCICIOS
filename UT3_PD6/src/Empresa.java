import java.util.Arrays;
import java.util.LinkedList;

public class Empresa {
    public LinkedList<Sucursal> listaSucursales = new LinkedList<Sucursal>();

    public Empresa(String Nombre){
        this.nombre = Nombre;
    }

    String nombre;

    public void agregarSucursales(String archivo){
        String[] sucursalesStr = Lector.leerArchivo(archivo);
        for (int s = 0; s < sucursalesStr.length; s++) {
            Sucursal sucu = new Sucursal(sucursalesStr[s]);
            listaSucursales.add(sucu);
        }
    }

    public Sucursal buscarSucursal(String ubicacion) {
        int indice = listaSucursales.indexOf(ubicacion);
        for (Sucursal sucu : listaSucursales) {
            if (sucu.getUbicacion().equals(ubicacion))
            {
                System.out.println("La sucursal fue encontrada.");
                return sucu;
            }
        }
        System.out.println("La sucursal no fue encontrada.");
        return null;
    }
    public void eliminarSucursales(String ubicacion) {
        for (Sucursal sucu : listaSucursales) {
            if (sucu.getUbicacion().equals(ubicacion))
            {
                listaSucursales.remove(sucu);
                break;
            }
        }
    }

    public String mostrarSucursales(){
        String[] sucu = new String[listaSucursales.size()];
        for (int i = 0; i < listaSucursales.size(); i++) {
            String proc = "Sucursal: " + listaSucursales.get(i).getUbicacion();
            sucu[i] = proc;
        }
        return Arrays.toString(sucu);
    }
    public String imprimir(String separador){
        String[] sucu = new String[listaSucursales.size()];
        for (int i = 0; i < listaSucursales.size(); i++) {
            String proc = listaSucursales.get(i).getUbicacion() + separador;
            sucu[i] = proc;
        }
        return Arrays.toString(sucu).replaceAll(",", "");
    }

    public int cantidadSucursales(){
        return listaSucursales.size();
    }

    public boolean sucursalesVacio(){
        return listaSucursales.isEmpty();
    }
}
