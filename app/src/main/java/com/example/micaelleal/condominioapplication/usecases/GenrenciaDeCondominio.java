package com.example.micaelleal.condominioapplication.usecases;

import com.example.micaelleal.condominioapplication.models.Apartamento;
import com.example.micaelleal.condominioapplication.models.Condominio;
import com.example.micaelleal.condominioapplication.models.Despesa;

import java.util.List;

public class GenrenciaDeCondominio {

    private List<Apartamento> apartamentos;
    private List<Despesa> despesasFixas;
    private List<Despesa> despesasEspecificas;

    public GenrenciaDeCondominio(List<Despesa> despesasFixas, List<Despesa> despesasEspecificas) {
        this.despesasFixas = despesasFixas;
        this.despesasEspecificas = despesasEspecificas;
    }

    public void lancarDespesasFixas(Despesa despesa) {
        despesasFixas.add(despesa);
    }

    public void lancarDespesasEspecificas(Despesa despesa) {
        despesasEspecificas.add(despesa);
    }

    public void calcularCondominio(String mesAno) {

        for (Despesa despesa : despesasFixas) {
            for (Apartamento apt : despesa.getApartamentos()) {
                Condominio condominio = apt.novoCondominio(mesAno);
                condominio.adicionarDespesa(despesa);
            }
        }

    }

}
