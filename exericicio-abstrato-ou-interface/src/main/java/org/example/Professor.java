package org.example;

public class Professor implements Ibonus{
    private String nome;
    private Integer qtdAulaSemanal;

    private Double valorDaHoraAula;

    public Professor(String nome, Integer qtdAulaSemanal, Double valorDaHoraAula) {
        this.nome = nome;
        this.qtdAulaSemanal = qtdAulaSemanal;
        this.valorDaHoraAula = valorDaHoraAula;
    }

    @Override
    public Double getValorBonus() {
        return ((qtdAulaSemanal * valorDaHoraAula) * 4.5) * 0.15;
    }
}
