class Token {
    private String nome;
    private double valor;

    public Token(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
    }
}

class TokenFungivel extends Token {
    private int quantidade;

    public TokenFungivel(String nome, double valor, int quantidade) {
        super(nome, valor);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade: " + quantidade);
    }
}

class TokenNaoFungivel extends Token {
    private String idUnico;

    public TokenNaoFungivel(String nome, double valor, String idUnico) {
        super(nome, valor);
        this.idUnico = idUnico;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(String idUnico) {
        this.idUnico = idUnico;
    }


    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("ID Único: " + idUnico);
    }
}
