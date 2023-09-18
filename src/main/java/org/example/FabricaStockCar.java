package org.example;

public class FabricaStockCar implements FabricaAbstrata{
    @Override
    public Equipes createEquipes() {
        return new EquipesStockCar();
    }

    @Override
    public Lider createLider() {
        return new LiderStockCar();
    }
}
