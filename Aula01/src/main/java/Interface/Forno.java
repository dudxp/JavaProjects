package Interface;

public class Forno extends Eletronico {
    @Override
    public double calcularEnergia()
    {
        return super.getEnergiaGasta() * 1.20;
    }
}
