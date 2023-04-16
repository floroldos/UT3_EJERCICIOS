import java.util.List;
import java.util.Stack;

public class Expresion {
    public static boolean controlCorchetes(List<Character> listaDeEntrada){
        Stack<Character> pila = new Stack<>();
        for (Character corchete : listaDeEntrada) {
            if (corchete == '{') {
                pila.push(corchete);
            } else if (corchete == '}') {
                if (pila.isEmpty() || pila.pop() != '{') {
                        return false;
                    }
                }
        }
        return pila.isEmpty();
    }
}
