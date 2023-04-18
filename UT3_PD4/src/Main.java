import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1

        String[] lineas = Lector.leerArchivo("src/altas.txt");
        Almacen deposito = new Almacen();
        int montoTotal = 0;
        for (String linea : lineas) {
            String[] detalles = linea.split(",");
            Producto prod = new Producto(detalles[1], Integer.parseInt(detalles[0]), Integer.parseInt(detalles[2]), Integer.parseInt(detalles[3]));
            deposito.insertarProducto(prod);
            montoTotal += (prod.getStock() * prod.getPrecio());
        }
        System.out.println("El monto total final es: " + montoTotal);

        //Ejercicio 2

        String[] lineas2 = Lector.leerArchivo("src/ventas.txt");
        int montoTotal2 = 0;
        for (String renglon : lineas2){
            String[] detalles2 = renglon.split(",");
            Producto prod = deposito.buscarPorCodigo(Integer.parseInt(detalles2[0]));
            deposito.restarStock(Integer.parseInt(detalles2[0]), Integer.parseInt(detalles2[1]));
            if (prod != null){
                montoTotal2 += (prod.getStock() * prod.getPrecio());
            }
        }
        System.out.println("El monto final, con el stock reducido es: " + montoTotal2);

    }
}