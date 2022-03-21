package Encapsulamento;

public class Arvore {
    private String nome;
    private String nomeCientifico;
    private Number altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }


    public Number getAltura() {
        return altura;
    }

    public void setAltura(Number altura) {
        this.altura = altura;
    }
}
