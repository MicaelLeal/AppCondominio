package com.example.micaelleal.condominioapplication.models;

import java.util.Date;
import java.util.List;

public class Condominio {

    private String mesAno;
    private Apartamento apartamento;
    private double valorAPagar;
    private double valorPago;
    private Date dataPagamento;
    private List<ItemCondominio> itens;

    public Condominio(String mesAno, Apartamento apartamento) {
        this.mesAno = mesAno;
        this.apartamento = apartamento;
    }

    public void adicionarDespesa(Despesa despesa, String referencia) {
        itens.add(new ItemCondominio(referencia, despesa, apartamento));
    }

    public String getMesAno() {
        return mesAno;
    }
}
