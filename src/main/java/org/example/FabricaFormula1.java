package org.example;

public class FabricaFormula1 implements FabricaAbstrata{
    @Override
    public Equipes createEquipes() {
        return new EquipesFormula1();
    }

    @Override
    public Lider createLider() {
        return new LiderFormula1();
    }
}
