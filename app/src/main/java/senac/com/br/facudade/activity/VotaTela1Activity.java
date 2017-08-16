package senac.com.br.facudade.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import senac.com.br.facudade.R;

public class VotaTela1Activity extends AppCompatActivity {
    EditText edtNome;
    NumberPicker npNota1,npNota2,npNota3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vota_tela1);


        edtNome  = (EditText) findViewById(R.id.nome);
        npNota1= (NumberPicker) findViewById(R.id.npNota1);
        npNota2= (NumberPicker) findViewById(R.id.npNota2);
        npNota3= (NumberPicker) findViewById(R.id.npNota3);

        npNota1.setMinValue(0);
        npNota1.setMaxValue(10);


        npNota2.setMinValue(0);
        npNota2.setMaxValue(10);


        npNota3.setMinValue(0);
        npNota3.setMaxValue(10);




    }

    public void next(View v){

        String nome = edtNome.getText().toString();
        int n1 = npNota1.getValue();
        int n2 = npNota2.getValue();
        int n3 = npNota3.getValue();

        Intent it = new Intent(this, VotaTela2Activity.class);
        it.putExtra("nome_tela1", nome);
        it.putExtra("pn1_tela1", n1 );
        it.putExtra("pn2_tela1", n2 );
        it.putExtra("pn3_tela1", n3 );
        startActivity(it);
    }

}
