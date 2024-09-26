import java.util.Date;

public class emprestimo{
    private String nomeLeitor;
    private Date dataDevolucao;
    private Livro livroEmprestado;

    public emprestimo(Livro livro, String nomeLeitor, Date dataDevolucao){
        this.livroEmprestado = livro;
        this.nomeLeitor = nomeLeitor;
        this.dataDevolucao = dataDevolucao;

    }
}
