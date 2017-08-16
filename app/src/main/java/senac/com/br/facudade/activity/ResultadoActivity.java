package senac.com.br.facudade.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import senac.com.br.facudade.R;

public class ResultadoActivity extends AppCompatActivity {

    TextView txNome, txIdade, TxVotar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txNome = ( TextView ) findViewById(R.id.tvNome);
        txIdade = ( TextView ) findViewById(R.id.tvIdade);
        TxVotar = ( TextView ) findViewById(R.id.tvResVotar);

       Bundle param = getIntent().getExtras();
        String nome = param.getString("pNome");
        int idade = param.getInt("pIdade");

        txNome.setText(getString(R.string.nome)+": "+nome);
        txIdade.setText(getString(R.string.idade)+": "+idade);

        if( idade >= 16 )
         TxVotar.setText(getString(R.string.podeVotar)+": "+getString(R.string.sim));
        else
         TxVotar.setText(getString(R.string.podeVotar)+": "+getString(R.string.nao));
    }

    public void retornar(View view) {
        finish();
    }
}
