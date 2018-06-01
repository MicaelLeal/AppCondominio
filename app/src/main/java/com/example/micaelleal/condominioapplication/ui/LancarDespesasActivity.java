package com.example.micaelleal.condominioapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.micaelleal.condominioapplication.R;
import com.example.micaelleal.condominioapplication.controlers.GerenciaDeCondominioControler;
import com.example.micaelleal.condominioapplication.models.Apartamento;
import com.example.micaelleal.condominioapplication.models.Despesa;
import com.example.micaelleal.condominioapplication.models.Proprietario;

import java.util.ArrayList;
import java.util.List;

public class LancarDespesasActivity extends AppCompatActivity {

    GerenciaDeCondominioControler controler;
    List<Apartamento> apartamentos;
    List<Despesa> despesasFixas;
    List<Despesa> despesasEspecificas;
    EditText nomeDespesa;
    EditText valorDespesa;
    RadioGroup ratificada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancar_despesas);

        criarListaApartamentos();
        despesasFixas = new ArrayList<>();
        despesasEspecificas = new ArrayList<>();

        controler = new GerenciaDeCondominioControler(apartamentos, despesasFixas, despesasEspecificas);

        nomeDespesa = findViewById(R.id.nome_despesa);
        valorDespesa = findViewById(R.id.valor_despesa);
        ratificada = (RadioGroup) findViewById(R.id.rati_group);

    }

    private void criarListaApartamentos(){

        for (int i = 0; i < 5; i++){
            apartamentos.add(new Apartamento(i,4,new Proprietario("Daniel","86970707070")));
        }
    }

    public void calcularDespesa(View view) {

        boolean ratificado;
        if (ratificada.getCheckedRadioButtonId() == R.id.rati_sim) ratificado = true;
        else ratificado = false;

        controler.chamalancaDespesaFixa(nomeDespesa.getText().toString(), Float.valueOf(valorDespesa.toString().toString()), ratificado);

    }
}
