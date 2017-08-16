package senac.com.br.facudade.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import senac.com.br.facudade.R;

public class VotarActivity extends AppCompatActivity {

    EditText edtNome;
    NumberPicker npIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votar);

        edtNome  = (EditText) findViewById(R.id.nome);
        npIdade = (NumberPicker) findViewById(R.id.npIdade);

        npIdade.setMinValue(0);
        npIdade.setMaxValue(100);
        npIdade.setValue(20);
    }


    public void enviar(View v){
        String nome = edtNome.getText().toString();
        int idade = npIdade.getValue();

        Intent it = new Intent(this, ResultadoActivity.class);
        it.putExtra("pNome", nome);
        it.putExtra("pIdade", idade );
        startActivity(it);
    }


}
