package Biblioteca.modelo;

public abstract class Livro {
    protected final String titulo;
    protected String autor;
    private String anoPublicacao;
    protected Genero genero;
    protected static final double TAXA_RESERVA = 1.00;
    private static int quantidadeLivros = 0;

    public Livro(String titulo, String autor, String anoPublicacao, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        quantidadeLivros++;
    }

    public abstract double totalReserva();

    public abstract boolean estaDisponivel();

    @Override
    public String toString() {
        return "Livro : " + titulo + '\n' +
                "Autor : " + autor + '\n' +
                "Ano publicação : " + anoPublicacao + '\n' +
                "Gênero : " + genero + '\n' +
                "Taxa de reserva : " + TAXA_RESERVA + '\n' +
                "Disponível : " + estaDisponivel() + '\n' +
                "Total de livros cadastrados : " + quantidadeLivros;
    }

    public static int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Genero getGenero() {
        return genero;
    }
}
