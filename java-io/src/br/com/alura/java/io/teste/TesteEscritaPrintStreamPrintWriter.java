package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
    
    public static void main(String[] args) throws IOException {
        
        //OutputStream fos = new FileOutputStream("java-io/lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);

        //BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/lorem2.txt"));

        //PrintStream ps = new PrintStream(new File("java-io/lorem2.txt"));

        PrintWriter ps = new PrintWriter("java-io/lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        ps.println();
        ps.println();
        ps.println();
        ps.println("HAHAHAHAHAHAHAH!!!!!!");

        ps.close();
    }
}
