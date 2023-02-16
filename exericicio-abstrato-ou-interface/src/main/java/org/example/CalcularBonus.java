package org.example;

import java.util.List;

public class CalcularBonus {

    List<Ibonus> funcBonus;

    public CalcularBonus(List<Ibonus> funcBonus) {
        this.funcBonus = funcBonus;
    }

    public void adicFuncBonus(Ibonus iB) {
        funcBonus.add(iB);
    }
}
