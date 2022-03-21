package Polimorfismo;

public class Centopeia extends Inseto {
    public boolean peluda;

    public Centopeia() {
    }

    public Centopeia(int qtdePernas, String nomeCientifico, boolean peluda) {
        super(qtdePernas, nomeCientifico);
        this.peluda = peluda;
    }
    
    public boolean isPeluda() {
        return peluda;
    }

    public void setPeluda(boolean peluda) {
        this.peluda = peluda;
    }
    
    @Override
    public void consegueVoar()
    {
        System.out.println("A centopéia não consegue voar.");
    }
}
