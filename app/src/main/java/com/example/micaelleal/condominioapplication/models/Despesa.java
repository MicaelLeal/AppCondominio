package com.example.micaelleal.condominioapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Despesa {

    private String nome;
    private double valor;
    private boolean valorRateado;
    private List<Apartamento> apartamentos;

    public Despesa(String nome, double valor, boolean valorRateado, List<Apartamento> apartamentos) {
        this.nome = nome;
        this.valor = valor;
        this.valorRateado = valorRateado;
        this.apartamentos = apartamentos;
    }

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isValorRateado() {
        return valorRateado;
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

}
