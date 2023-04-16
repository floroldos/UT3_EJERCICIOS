public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("AED");
        empresa.agregarSucursales("src/suc3.txt");
        System.out.println( empresa.imprimir(";_"));
    }
}

//Preguntas del TA10 aplicadas a pd8
//1- d) 107
//2- c) Shenzhen
//3- d) ninguna de las anteriores
//4- d) [Montreal;_ Caracas;_ Tulsa;_ Mobile;_ Vancouver;_]