import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> expresionCorrecta = new ArrayList<>();
        expresionCorrecta.add('{');
        expresionCorrecta.add('}');
        expresionCorrecta.add('{');
        expresionCorrecta.add('{');
        expresionCorrecta.add('}');
        expresionCorrecta.add('}');

        boolean resultado = Expresion.controlCorchetes(expresionCorrecta);
        System.out.println(resultado);
        if (resultado == true) {
            System.out.println("La expresión " + expresionCorrecta + " es correcta.");
        } else {
            System.out.println("La expresión " + expresionCorrecta + " es incorrecta.");
        }
    }
}