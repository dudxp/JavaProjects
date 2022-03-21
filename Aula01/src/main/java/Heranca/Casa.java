package Heranca;

public class Casa extends Endereco {
    private Number preco;
    private String proprietario;
    
    public Casa(){}
    
    public Casa(String bairro, String rua,int numero, Number preco, String proprietario)
    {
        super(bairro,rua,numero);
        this.preco = preco;
        this.proprietario = proprietario;
    }

    public Number getPreco() {
        return preco;
    }

    public void setPreco(Number preco) {
        this.preco = preco;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
