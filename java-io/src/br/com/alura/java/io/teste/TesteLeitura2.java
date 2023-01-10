package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(new File("java-io/contas.csv"));

        while(scanner.hasNextLine()){
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt","BR"), "%s - %04d-%05d, %s Saldo: %1.2f", tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

        }
        scanner.close();
    }
}
