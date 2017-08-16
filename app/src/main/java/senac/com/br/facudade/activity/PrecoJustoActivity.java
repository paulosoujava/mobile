package senac.com.br.facudade.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import senac.com.br.facudade.R;

public class PrecoJustoActivity extends AppCompatActivity {

    EditText nome, valor, parcela, juros;
    TextView idResultado;
    LinearLayout layoutDinamico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preco_justo);


        nome = (EditText) findViewById(R.id.nomeproduto);
        valor = (EditText) findViewById(R.id.valor);
        juros = (EditText) findViewById(R.id.juros);
        parcela = (EditText) findViewById(R.id.parcela);
        idResultado = (TextView) findViewById(R.id.idResultado);

        layoutDinamico = (LinearLayout) findViewById(R.id.layoutResultado);
    }

    public void calcular(View view) {

        try {
            Float total = (Float.valueOf(juros.getText().toString()) / 100) * Float.valueOf(valor.getText().toString());
            Float vlTotal = total / Integer.parseInt(parcela.getText().toString());

             String tx = "Nome do Produto "+ nome.getText().toString() +"\n Valor Inicial "+ valor.getText().toString() + "\nValor Parcela "+total.toString()+"\n Valor total "+vlTotal+"" +
                     "\nTotal d juros "+(Float.valueOf(juros.getText().toString()) / 100);

            idResultado.setText(tx);

            clear(view);
        }catch (Exception e){
            Toast.makeText(this, "Opss tente de novo", Toast.LENGTH_SHORT ).show();
        }
    }

    public void clear(View view) {
        nome.setText("");
        valor.setText("");
        juros.setText("");
        parcela.setText("");
    }

    public void voltar(View view) {
        finish();

    }


}