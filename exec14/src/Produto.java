public class Produto {
    private String nome;
    private Integer valor;
    private Integer quant_prod;
    private Integer faturamento;

    void setNome(String nome){
        this.nome = nome;
    }

    void setValor(Double valor){
        valor = valor * 100;
        this.valor = valor.intValue();
    }

    void setQuant_prod(Integer quant_prod){
        if(quant_prod < 0){
        this.quant_prod = quant_prod;
        }else{
            System.out.println("Quantidade tem que ser maior que zero");
            }
        }
    void vender(Integer quantidade){
        if(quantidade <= quant_prod){
            this.quant_prod = this.quant_prod - quantidade;
            this.faturamento = this.faturamento + (quantidade*this.valor);
            
        }
    }
}
