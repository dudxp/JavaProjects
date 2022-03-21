package Polimorfismo;

public class Inseto 
{
    private int qtdePernas;
    private String nomeCientifico;

    public Inseto () {}

    public Inseto(int qtdePernas, String nomeCientifico) {
        this.qtdePernas = qtdePernas;
        this.nomeCientifico = nomeCientifico;
    }
    
    public int getQtdePernas() {
        return qtdePernas;
    }

    public void setQtdePernas(int qtdePernas) {
        this.qtdePernas = qtdePernas;
    }

    public String getNome() {
        return nomeCientifico;
    }

    public void setNome(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }
    
    public void consegueVoar() 
    {
        System.out.println("Se o inseto consegue voar é definido nas subclasses.");
    }
}
