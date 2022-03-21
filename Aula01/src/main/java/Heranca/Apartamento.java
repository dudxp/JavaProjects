package Heranca;

public class Apartamento extends Endereco {
    private Number aluguel;

    public Apartamento() {
    }

    public Apartamento(String bairro, String rua, int numero,Number aluguel) {
        super(bairro, rua, numero);
        this.aluguel = aluguel;
    }
    

    public Number getAluguel() {
        return aluguel;
    }

    public void setAluguel(Number aluguel) {
        this.aluguel = aluguel;
    }
}
