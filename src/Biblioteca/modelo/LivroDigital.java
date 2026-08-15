package Biblioteca.modelo;

public class LivroDigital extends Livro {

    private String linkAcesso;

    public LivroDigital(String titulo, String autor, String anoPublicacao, Genero genero, String linkAcesso) {
        super(titulo, autor, anoPublicacao, genero);
        this.linkAcesso = linkAcesso;
    }

    @Override
    public double totalReserva() {
        return TAXA_RESERVA;
    }

    @Override
    public boolean estaDisponivel() {
        return true;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }
}