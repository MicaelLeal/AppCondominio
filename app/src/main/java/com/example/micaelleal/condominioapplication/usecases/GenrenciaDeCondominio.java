package com.example.micaelleal.condominioapplication.usecases;

import com.example.micaelleal.condominioapplication.models.Apartamento;
import com.example.micaelleal.condominioapplication.models.Condominio;
import com.example.micaelleal.condominioapplication.models.Despesa;

import java.util.List;

public class GenrenciaDeCondominio {

    private List<Despesa> despesas;

    public GenrenciaDeCondominio(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public void lancarDespesas(Despesa despesa) {
        despesas.add(despesa);
    }

    public void calcularCondominio(String mesAno) {

        for (Despesa despesa : despesas) {
            for (Apartamento apt : despesa.getApartamentos()) {
                Condominio condominio = apt.novoCondominio(mesAno);
                condominio.adicionarDespesa(despesa);
            }
        }
    }

}
