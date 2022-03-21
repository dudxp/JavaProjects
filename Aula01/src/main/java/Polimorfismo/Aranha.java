package Polimorfismo;

public class Aranha extends Inseto {
    private boolean venenosa;

    public Aranha() {
    }

    public Aranha(int qtdePernas, String nomeCientifico, boolean venenosa) {
        super(qtdePernas, nomeCientifico);
        this.venenosa = venenosa;
    }
    
    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    
    @Override
    public void consegueVoar()
    {
        System.out.println("A aranha não consegue voar.");
    }
}
