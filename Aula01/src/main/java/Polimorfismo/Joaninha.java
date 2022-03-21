package Polimorfismo;

public class Joaninha extends Inseto {
    public int qtdeAsas;

    public Joaninha() {
    }

    public Joaninha(int qtdePernas, String nomeCientifico, int qtdeAsas) {
        super(qtdePernas, nomeCientifico);
        this.qtdeAsas = qtdeAsas;
    }
    
    public int isPeluda() {
        return qtdeAsas;
    }

    public void setPeluda(int qtdeAsas) {
        this.qtdeAsas = qtdeAsas;
    }
    
    @Override
    public void consegueVoar()
    {
        System.out.println("A joaninha consegue voar.");
    }
}
