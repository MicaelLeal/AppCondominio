package com.example.micaelleal.condominioapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.micaelleal.condominioapplication.R;
import com.example.micaelleal.condominioapplication.models.App;
import com.example.micaelleal.condominioapplication.models.Proprietario;

import io.objectbox.Box;

public class CadastrarProprietarioAgoraVai extends AppCompatActivity {

    private EditText nome;
    private EditText telefone;
    private Box<Proprietario> proprietarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_proprietario_agora_vai);

        nome = findViewById(R.id.nome_proprietario);
        telefone = findViewById(R.id.telefone_proprietario);

        proprietarios = ((App)getApplication()).getBoxStore().boxFor(Proprietario.class);
    }

    public void CadastraProprietario(View view) {
        if(nome.getText().toString().trim().isEmpty() || telefone.getText().toString().trim().isEmpty()){
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show();
        }else{

            Proprietario novo = new Proprietario(nome.getText().toString(), telefone.getText().toString());
            proprietarios.put(novo);
            Toast.makeText(this, "Proprietario cadastrado com sucesso", Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
