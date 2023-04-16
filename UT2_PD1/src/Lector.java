import java.io.*;
public class Lector {
    public static int[] leerArchivo(String nombreCompletoArchivo) {
        try {
            FileReader fr = new FileReader(nombreCompletoArchivo);
            BufferedReader bf = new BufferedReader(fr);
            int largo = Integer.parseInt(bf.readLine());
            int[] arreglo = new int[largo];
            for (int i = 0; i <= largo - 1; i++) {
                arreglo[i] = Integer.parseInt(bf.readLine());
            }
            return arreglo;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
