package Interface;

public class Computador extends Eletronico implements Identificador {
    private final String senha = "Qwerty90";
    
    @Override
    public double calcularEnergia()
    {
        return super.getEnergiaGasta() * 3.10;
    }
    
    @Override
    public boolean identificar(String senha)
    {
        if (this.senha == senha)
        {
            return true;
        }
        return false;
    }
}
