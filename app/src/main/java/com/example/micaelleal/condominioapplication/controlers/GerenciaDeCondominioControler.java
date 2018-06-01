package com.example.micaelleal.condominioapplication.controlers;

import com.example.micaelleal.condominioapplication.models.Apartamento;
import com.example.micaelleal.condominioapplication.models.Condominio;
import com.example.micaelleal.condominioapplication.models.Despesa;
import com.example.micaelleal.condominioapplication.usecases.GerenciaDeCondominio;

import java.util.Date;
import java.util.List;

public class GerenciaDeCondominioControler {

    private GerenciaDeCondominio useCaseGerenciador;
    private List<Apartamento> apartamentos;
    private List<Despesa> despesasFixas;
    private List<Despesa> despesasEspecificas;

    public GerenciaDeCondominioControler(List<Apartamento> apartamentos,
            List<Despesa> despesasFixas, List<Despesa> despesasEspecificas) {
        this.apartamentos = apartamentos;
        this.despesasFixas = despesasFixas;
        this.despesasEspecificas = despesasEspecificas;
    }

    public Despesa chamalancaDespesaFixa(String nome, double valor, boolean valorRateado) {
        Despesa despesa = new Despesa(nome, valor, valorRateado, apartamentos);
        useCaseGerenciador.lancarDespesas(despesa);
        return despesa;
    }

    public Despesa chamaLancaDespesaEspecifica(String nome, double valor, boolean valorRateado,
                                          List<Apartamento> apartamentos) {
        Despesa despesa = new Despesa(nome, valor, valorRateado, apartamentos);
        useCaseGerenciador.lancarDespesas(despesa);
        return despesa;
    }

    public List<Condominio> chamaCalcularCondominho(int mes, int ano) {
        String mesAno = String.format("%02d/%d", mes, ano);
        return useCaseGerenciador.calcularCondominio(mesAno);
    }

}
