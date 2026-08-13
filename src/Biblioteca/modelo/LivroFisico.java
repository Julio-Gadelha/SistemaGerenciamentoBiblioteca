package Biblioteca.modelo;

public class LivroFisico extends Livro {
    private static final int ExemplaresDisoponiveis = 4;

    public LivroFisico(String titulo, String autor, String anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    public int livrosEmprestados() {
        int livrosDisponiveis =  ExemplaresDisoponiveis- livrosEmprestados() ;
        if ( livrosDisponiveis == 0){
            System.out.println("Livros indisponiveis");
        }
        return Integer.parseInt("Livros disponisveis : " + livrosDisponiveis);
    }
}
