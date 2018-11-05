package br.com.senaijandira.alunos.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import br.com.senaijandira.alunos.R;

public class VizualizarActivity extends AppCompatActivity {

    static EditText txtNome, txtDtNascimento , txtMatricula, txtCpf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vizualizar);


        txtNome = findViewById(R.id.txtNome);
        txtDtNascimento = findViewById(R.id.txtDtNascimento);
        txtMatricula = findViewById(R.id.txtMatricula);
        txtCpf = findViewById(R.id.txtCpf);


        int idAluno = getIntent().getIntExtra("idAluno",0);
        Log.d("ID_ALUNO",idAluno+"");
    }



}
