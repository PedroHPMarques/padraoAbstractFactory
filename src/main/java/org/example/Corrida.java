package org.example;

public class Corrida {
    private Equipes equipes;
    private Lider lider;

    public Corrida(FabricaAbstrata fabrica) {
        this.equipes = fabrica.createEquipes();
        this.lider = fabrica.createLider();
    }

    public String emitirEquipes() {
        return this.equipes.emitir();
    }

    public String emitirLider() {
        return this.lider.emitir();
    }

}
