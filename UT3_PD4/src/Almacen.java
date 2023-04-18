import java.time.Period;
import java.util.List;

public class Almacen implements IAlmacen{
    private Lista<Producto> productos;
    public Almacen(){
        this.productos = new Lista<Producto>();
    }
    public Lista<Producto> getProductos(){
        return this.productos;
    }
    @Override
    public String getDireccion() {
        return null;
    }

    @Override
    public void setDireccion(String direccion) {

    }

    @Override
    public String getTelefono() {
        return null;
    }

    @Override
    public void setTelefono(String telefono) {

    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public Lista getListaProductos() {
        return null;
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        this.productos.insertar(unProducto.getEtiqueta(), unProducto);
    }

    @Override
    public boolean eliminar(Comparable clave) {
        return false;
    }

    @Override
    public String imprimirProductos() {
        return null;
    }

    @Override
    public String imprimirSeparador(String separador) {
        return null;
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        Nodo<Producto> temporal = productos.getPrimero();
        while(temporal != null){
            if (temporal.getEtiqueta() == clave){
                temporal.getDato().setStock(temporal.getDato().getStock() + cantidad);
                return true;
            }
            temporal = temporal.getSiguiente();
        }
        return false;
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        int stock = 0;
        Nodo<Producto> temporal = productos.getPrimero();
        while (temporal != null) {
            if (clave.equals(temporal.getEtiqueta())) {
                if (temporal.getDato().getStock() < cantidad) {
                    temporal.getDato().setStock(0);
                } else {
                    temporal.getDato().setStock(temporal.getDato().getStock() - cantidad);
                    stock = temporal.getDato().getStock();
                }
            }
            temporal = temporal.getSiguiente();
        }
        return stock;
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        Nodo<Producto> nodoProducto = this.productos.buscar(clave);
        if (nodoProducto != null) {
            return nodoProducto.getDato();
        } else {
            return null;
        }
    }

    @Override
    public void listarOrdenadoPorNombre() {

    }

    @Override
    public Producto buscarPorDescripcion(String descripcion) {
        return null;
    }

    @Override
    public int cantidadProductos() {
        return 0;
    }
    public int getStock(Comparable clave){
        Nodo<Producto> temporal = productos.getPrimero();
        while(temporal != null){
            if(temporal.getEtiqueta().equals(clave)){
               return temporal.getDato().getStock();
            }
            temporal = temporal.getSiguiente();
        }
        return -1;
    }
}
