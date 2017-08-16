package senac.com.br.facudade.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import senac.com.br.facudade.R;

public class VotaTela2Activity extends AppCompatActivity {

    EditText edtNome;
    NumberPicker npNota1,npNota2,npNota3;
    int n1, n2, n3;
    String nome1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vota_tela2);

        Bundle param = getIntent().getExtras();

         nome1 = param.getString("nome_tela1");

         n1 = param.getInt("pn1_tela1");
         n2 = param.getInt("pn2_tela1");
         n3 = param.getInt("pn3_tela1");


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
        int n4 = npNota1.getValue();
        int n5 = npNota2.getValue();
        int n6 = npNota3.getValue();

        Intent it = new Intent(this, ResultadoVotar123Activity.class);

        it.putExtra("nome_tela1", nome1);
        it.putExtra("pn1_tela1", n1 );
        it.putExtra("pn2_tela1", n2 );
        it.putExtra("pn3_tela1", n3 );

        it.putExtra("nome_tela2", nome);
        it.putExtra("pn1_tela2", n4 );
        it.putExtra("pn2_tela2", n5 );
        it.putExtra("pn3_tela2", n6 );



        startActivity(it);
    }
}
