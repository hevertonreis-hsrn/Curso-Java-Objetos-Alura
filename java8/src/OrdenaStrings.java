import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    
    public static void main(String[] args) {
        
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Editora Casa do Código");
        palavras.add("Caelum");

        //Comparator<String> comparador = new ComparadorPorTamanho();
        //Collections.sort(palavras, comparador);
        //palavras.sort( (s1, s2) -> {
        //    if (s1.length() < s2.length()) {
        //        return -1;
        //    }
        //    if (s1.length() > s2.length()) {
        //        return 1;
        //    }
        //
        //    return 0;
        //});

        //palavras.sort( (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        //palavras.sort(Comparator.comparing(s->s.length()));
        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
        System.out.println("-----------");

        //Consumer<String> consumidor = new ImprimeNaLinha();
        //palavras.forEach( s -> System.out.println(s) );
        palavras.forEach( System.out::println);
    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
    
}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }

        return 0;
    }
}
