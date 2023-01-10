package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    
    public static void main(String[] args) throws IOException {
        
        //OutputStream fos = new FileOutputStream("java-io/lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw = new BufferedWriter(osw);

        BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        bw.newLine();
        bw.write("HAHAHAHAHAHAHAH!!!!!!");

        bw.close();
    }
}
