public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("AED");
        empresa.agregarSucursales("src/suc1.txt");
        System.out.println(empresa.mostrarSucursales());
        System.out.println(empresa.sucursalesVacio());
        System.out.println(empresa.cantidadSucursales());
        empresa.eliminarSucursales("Chicago");
        System.out.println(empresa.buscarSucursal("Tokio"));
    }
}