
//Desarrolla un programa JAVA que implemente el ejercicio 1, usando un contador para contar
//cuántas veces se va a invocar la sentencia “si”)
//Leer de un archivo “numeros.txt” (adjunto) cuya primera línea será la cantidad de números a
//leer (sea “N”) y las siguientes N líneas contendrán los elementos de entrada del algoritmo, uno
//por cada línea.
//Mostrar por consola el largo N, el contenido del contador, y los números que quedaron en la
//primera y en la última posición del arreglo
public class Main {
    public static void main(String[] args) {
        int[] arreglo = Lector.leerArchivo("src/numeros.txt");
        Contar.contadorSi(arreglo);
    }
}