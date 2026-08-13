package Biblioteca.modelo;

public abstract class Livro implements Emprestavel {
    protected final String titulo;
    protected String autor;
    private String anoPublicacao;
    protected static final double taxaReserva = 1.00;
    private static int quantidadeLivros = 0;

    public Livro(String titulo, String autor, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        quantidadeLivros++;
    }

    public abstract int livrosEmprestados();

    @Override
    public String toString() {
        return "Livros disponisveis : " + titulo + '\n' +
                "Livro autor : " + autor + '\n' +
                "Livro ano publicação : " + '\n' +
                "Livros TaxaRerserva : " + taxaReserva + '\n' +
                "Livros Usados : " + quantidadeLivros +
                "Livros Emprestados : " + livrosEmprestados();

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
}
