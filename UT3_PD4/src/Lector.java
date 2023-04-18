import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lector {
	public static String[] leerArchivo(String nombreCompletoArchivo) {
		FileReader fr;
		ArrayList<String> listaLineasArchivo = new ArrayList<>();
		try {
			fr = new FileReader(nombreCompletoArchivo);
			BufferedReader br = new BufferedReader(fr);
			String lineaActual = br.readLine();
			while (lineaActual != null) {
				lineaActual = lineaActual.replaceAll("[^a-zA-Z0-9, ]", "");
				listaLineasArchivo.add(lineaActual);
				lineaActual = br.readLine();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo "
					+ nombreCompletoArchivo);
			e.printStackTrace();
		}
		System.out.println("Archivo leido satisfactoriamente");

		return listaLineasArchivo.toArray(new String[0]);
	}
}
