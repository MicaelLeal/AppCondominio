package com.example.micaelleal.condominioapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {

    private int numero;
    private int qtdQuartos;
    private TipoOcupacao ocupacao;
    private Proprietario proprietario;
    private List<Condominio> condominios;

    public Apartamento(int numero, int qtdQuartos, Proprietario proprietario) {
        this.numero = numero;
        this.qtdQuartos = qtdQuartos;
        this.proprietario = proprietario;
        this.ocupacao = TipoOcupacao.VAZIO;
    }

    public Condominio novoCondominio(String mesAno) {
        Condominio condominio;
        if (!condominios.isEmpty()) {
            condominio = condominios.get(condominios.size() -1);
            if (condominio.getMesAno().equals(mesAno)) {
                return condominio;
            }
        }
        condominio = new Condominio(mesAno, this);
        condominios.add(condominio);
        return condominio;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }
}
