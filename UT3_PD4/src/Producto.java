public class Producto implements IProducto{
    private String nombre;
    private Comparable<Integer> codigo;
    private int precio;
    private int stock;

    public Producto(String nombre, Comparable<Integer> codigo, int precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }
    @Override
    public Comparable getEtiqueta() {
        return this.codigo;
    }

    @Override
    public Integer getPrecio() {

        return this.precio;
    }

    @Override
    public void setPrecio(Integer precio) {

    }

    @Override
    public Integer getStock() {
        return this.stock;
    }

    @Override
    public void setStock(Integer stock) {

    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void setNombre(String nombre) {

    }
}
