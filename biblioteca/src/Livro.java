public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean status = false;


    public Livro (String titulo, String autor, Integer anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.status = true;

    }
    public String getAutor(String autor){
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public Integer getAnoPublicacao(){
        return anoPublicacao;
    }

    public Boolean getStatus() {
        return !this.status;
    }

    public void setAutor(){
        this.autor = autor;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    public void setAnoPublicacao(){
        this.anoPublicacao = anoPublicacao;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}

