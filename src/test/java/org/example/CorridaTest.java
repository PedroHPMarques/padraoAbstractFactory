package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorridaTest {
    @Test
    void deveEmitirEquipesFormula1() {
        FabricaAbstrata fabrica = new FabricaFormula1();
        Corrida corrida = new Corrida(fabrica);
        assertEquals("Equipes da formula 1", corrida.emitirEquipes());
    }

    @Test
    void deveEmitirEquipesStockCar() {
        FabricaAbstrata fabrica = new FabricaStockCar();
        Corrida corrida = new Corrida(fabrica);
        assertEquals("Equipes da stockcar", corrida.emitirEquipes());
    }

    @Test
    void deveEmitirLiderFormula1() {
        FabricaAbstrata fabrica = new FabricaFormula1();
        Corrida corrida = new Corrida(fabrica);
        assertEquals("Lider da formula 1", corrida.emitirLider());
    }

    @Test
    void deveEmitirLiderStockCar() {
        FabricaAbstrata fabrica = new FabricaStockCar();
        Corrida corrida = new Corrida(fabrica);
        assertEquals("Lider da stockcar", corrida.emitirLider());
    }
}