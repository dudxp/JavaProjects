package Interface;

public class Computador extends Eletronico {
    @Override
    public double calcularEnergia()
    {
        return super.getEnergiaGasta() * 3.10;
    }
}
