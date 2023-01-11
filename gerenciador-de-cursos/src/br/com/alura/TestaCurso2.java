package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 18));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 18));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 18));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
        System.out.println("----------");

        List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println("----------");

        System.out.println(javaColecoes);

    }
}
