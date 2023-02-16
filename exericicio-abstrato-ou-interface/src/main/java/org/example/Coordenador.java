package org.example;

public class Coordenador implements Ibonus{
    private String nome;
    private Integer qtdHoraCordSemanal;
    private Double valorHoraCord;

    public Coordenador(String nome, Integer qntHoraCordSemanal, Double valorHoraCord) {
        this.nome = nome;
        this.qtdHoraCordSemanal = qntHoraCordSemanal;
        this.valorHoraCord = valorHoraCord;
    }

    @Override
    public Double getValorBonus() {
        return ((qtdHoraCordSemanal * valorHoraCord) * 4.5) * 0.2;
    }
}
