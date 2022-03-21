package Interface;

public class Geladeira extends Forno {
    @Override
    public double calcularEnergia()
    {
        return super.getEnergiaGasta() * 5.90;
    }
}
