package org.example;

public class TesteTributo {
    public static void main(String[] args) {

        Alimento a = new Alimento(123, "Pacote de Feijão 1kg", 8.99, 9);

        Perfume p = new Perfume(123, "Celso Portiolli", 11.09, "adocicada com " +
                 "toques de limão");

        Servico s = new Servico("Matador de aluguel", 250000.0);

        Tributo t = new Tributo();

        t.adicionaTributavel(a);

        t.adicionaTributavel(p);

        t.adicionaTributavel(s);

        t.calculaTotalTributo();
    }
}
