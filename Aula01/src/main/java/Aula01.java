
import Heranca.Casa;
import Heranca.Apartamento;
import Encapsulamento.Arvore;

public class Aula01 
{
    public static void main (String[] args)
    {
        Arvore a1 = new Arvore();
        
        a1.setNome("Cidreira");
        a1.setNomeCientifico("Melissa officinalis");
        a1.setAltura(1.5);
        
        Casa c1 = new Casa();
        
        c1.setPreco(800000);
        c1.setProprietario("Eduardo Rossetti Boeira");
        c1.setNumero(723);
        c1.setBairro("São Bento");
        c1.setRua("Senador Salgado Filho");
        
        System.out.println("Endereço da casa");
        System.out.println("----------------");
        System.out.println("Rua:" + c1.getRua());
        System.out.println("Bairro: " + c1.getBairro());
        System.out.println("Numero: " + c1.getNumero());
        System.out.println("Proprietário: " + c1.getProprietario());
        System.out.println("----------------");
        System.out.println("Valor R$" + c1.getPreco());
        
        Apartamento e1 = new Apartamento();
        e1.setAluguel(900);
        e1.setNumero(678);
        e1.setBairro("Argentino");
        e1.setRua("Palmeiras");
        
        System.out.println("Endereço do apartamento");
        System.out.println("----------------");
        System.out.println("Rua:" + e1.getRua());
        System.out.println("Bairro: " + e1.getBairro());
        System.out.println("Numero: " + e1.getNumero());
        System.out.println("----------------");
        System.out.println("Aluguel mensal R$" + e1.getAluguel());
    }
}
