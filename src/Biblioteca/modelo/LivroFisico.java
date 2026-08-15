package Biblioteca.modelo;

public class LivroFisico extends Livro implements Emprestavel {
    private int exemplaresDisponiveis;

    public LivroFisico(String titulo, String autor, String anoPublicacao, Genero genero, int exemplaresDisponiveis) {
        super(titulo, autor, anoPublicacao, genero);
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    @Override
    public double totalReserva() {
        return TAXA_RESERVA;
    }

    @Override
    public boolean estaDisponivel() {
        return exemplaresDisponiveis > 0;
    }

    @Override
    public void emprestar() {
        if (exemplaresDisponiveis > 0) {
            exemplaresDisponiveis--;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Não há exemplares disponíveis.");
        }
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }
}
