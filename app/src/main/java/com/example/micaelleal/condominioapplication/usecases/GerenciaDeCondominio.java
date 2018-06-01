package com.example.micaelleal.condominioapplication.usecases;

import com.example.micaelleal.condominioapplication.models.Apartamento;
import com.example.micaelleal.condominioapplication.models.Condominio;
import com.example.micaelleal.condominioapplication.models.Despesa;

import java.util.ArrayList;
import java.util.List;

public class GerenciaDeCondominio {

    private List<Despesa> despesas;

    public GerenciaDeCondominio(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public void lancarDespesas(Despesa despesa) {
        despesas.add(despesa);
    }

    public List<Condominio> calcularCondominio(String mesAno) {

        List<Condominio> condominios = new ArrayList<>();
        for (Despesa despesa : despesas) {
            for (Apartamento apt : despesa.getApartamentos()) {
                Condominio condominio = apt.novoCondominio(mesAno);
                condominio.adicionarDespesa(despesa);
                condominios.add(condominio);
            }
        }
        return condominios;
    }

}
