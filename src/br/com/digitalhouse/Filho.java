package br.com.digitalhouse;

public class Filho {

    private String mae;
    private String pai;
    private String nome;

    public Filho(String nomeMae, String nomePai, String nomeFilho) {
        this.mae = nomeMae;
        this.pai = nomePai;
        this.nome = nomeFilho;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public String getPai() {
        return pai;
    }

    public String getNome() {
        return nome;
    }
}
