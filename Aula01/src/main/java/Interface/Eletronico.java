package Interface;

public abstract class Eletronico {
    protected double energiaGasta;

    public double getEnergiaGasta() {
        return energiaGasta;
    }

    public void setEnergiaGasta(double energiaGasta) {
        this.energiaGasta = energiaGasta;
    }
    
    public abstract double calcularEnergia();
}
