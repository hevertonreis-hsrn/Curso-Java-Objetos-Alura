package br.com.alura;

public class TestaCurso {
    
    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 18));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 18));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 18));

        System.out.println(javaColecoes.getAulas());

    }
}
