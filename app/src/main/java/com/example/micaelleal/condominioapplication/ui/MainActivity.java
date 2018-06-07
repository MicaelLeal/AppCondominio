package com.example.micaelleal.condominioapplication.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.micaelleal.condominioapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrarApartamento(View view) {
        startActivity(new Intent(this, CadastrarApartamentoActivity.class));
    }

    public void lancarDespesas(View view) {
        startActivity(new Intent(this, LancarDespesasActivity.class));
    }

    public void calcularCondominios(View view) {
        startActivity(new Intent(this, CondominiosActivity.class));
    }

    public void ChamaCadastroProprietario(View view) {
        startActivity(new Intent(this, CadastrarProprietarioAgoraVai.class));

    }
}

