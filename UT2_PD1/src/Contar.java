
public class Contar {
    public static void contadorSi(int[] arreglo){
        int contador = 0;
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arreglo[j] < arreglo[j - 1]) {
                    intercambia(arreglo, j, j - 1);
                    contador += 1;
                }
            }
        }
        System.out.println("El largo N: " + n);
        System.out.println("El contador de Ifs es: " + contador);
        System.out.println("Primer número: " + arreglo[0]);
        System.out.println("Último número: " + arreglo[n - 1]);
    }
    public static void intercambia(int[] arreglo, int i, int j) {
        int temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }
}
