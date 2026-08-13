package Biblioteca.modelo;

public class LivroDigital  extends Livro {

    public LivroDigital(String titulo, String autor, String anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public int livrosEmprestados() {
        return livrosEmprestados();
    }

    public void linkAcesso(){
        System.out.println("www.seulivroAqui");
    }
}
