package Biblioteca;

import Biblioteca.Sistema.Biblioteca;
import Biblioteca.modelo.Genero;
import Biblioteca.modelo.Livro;
import Biblioteca.modelo.LivroDigital;
import Biblioteca.modelo.LivroFisico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao = -1;

        while (opcao != 5) {
            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1 - Cadastrar livro físico");
            System.out.println("2 - Cadastrar livro digital");
            System.out.println("3 - Listar todos os livros");
            System.out.println("4 - Verificar disponibilidade de um livro");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();

                System.out.print("Autor: ");
                String autor = scanner.nextLine();

                System.out.print("Ano de publicação: ");
                String ano = scanner.nextLine();

                System.out.print("Gênero (FICCAO, TECNICO, BIOGRAFIA): ");
                Genero genero = Genero.valueOf(scanner.nextLine().toUpperCase());

                System.out.print("Quantidade de exemplares: ");
                int exemplares = scanner.nextInt();
                scanner.nextLine();

                Livro livro = new LivroFisico(titulo, autor, ano, genero, exemplares);
                biblioteca.cadastrarLivro(livro);

            } else if (opcao == 2) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();

                System.out.print("Autor: ");
                String autor = scanner.nextLine();

                System.out.print("Ano de publicação: ");
                String ano = scanner.nextLine();

                System.out.print("Gênero (FICCAO, TECNICO, BIOGRAFIA): ");
                Genero genero = Genero.valueOf(scanner.nextLine().toUpperCase());

                System.out.print("Link de acesso: ");
                String link = scanner.nextLine();

                Livro livro = new LivroDigital(titulo, autor, ano, genero, link);
                biblioteca.cadastrarLivro(livro);

            } else if (opcao == 3) {
                biblioteca.listarLivros();

            } else if (opcao == 4) {
                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();

                Livro livro = biblioteca.buscarPorTitulo(titulo);
                if (livro == null) {
                    System.out.println("Livro não encontrado.");
                } else {
                    System.out.println("Disponível: " + livro.estaDisponivel());
                }

            } else if (opcao == 5) {
                System.out.println("Saindo... Total de livros cadastrados: " + biblioteca.getTotalLivros());

            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}