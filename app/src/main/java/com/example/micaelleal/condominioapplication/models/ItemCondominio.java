package com.example.micaelleal.condominioapplication.models;

public class ItemCondominio {

    private String referencia;
    private double valor;
    private Despesa despesa;

    public ItemCondominio(String referencia, Despesa despesa, Apartamento apartamento) {
        this.referencia = referencia;
        this.despesa = despesa;
        calacularValor(despesa, apartamento.getQtdQuartos());
    }

    @Override
    public String toString() {
        return despesa.getNome() +" --- "+ this.valor;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getValor() {
        return valor;
    }

    private void calacularValor(Despesa despesa, int qtdQuartos) {
        int qtdTotalQuartos = 0;
        for (Apartamento apt : despesa.getApartamentos()) {
            qtdTotalQuartos += apt.getQtdQuartos();
        }

        if (despesa.isValorRateado()) {
            this.valor = despesa.getValor() / qtdTotalQuartos * qtdQuartos;
        } else {
            this.valor = despesa.getValor() / despesa.getApartamentos().size();
        }

    }

}
