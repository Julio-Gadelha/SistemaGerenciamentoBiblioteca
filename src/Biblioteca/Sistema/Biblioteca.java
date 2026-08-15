package Biblioteca.Sistema;

import Biblioteca.modelo.Livro;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
            return;
        }

        for (Livro livro : livros) {
            System.out.println(livro);
            System.out.println("==============");
        }
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public int getTotalLivros() {
        return livros.size();
    }
}