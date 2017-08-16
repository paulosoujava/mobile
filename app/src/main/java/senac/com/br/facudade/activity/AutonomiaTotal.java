package senac.com.br.facudade.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import senac.com.br.facudade.R;

public class AutonomiaTotal extends AppCompatActivity {

    TextView carroNome, km, combustivel, resultTotal;
    LinearLayout layoutDinamico;
    ArrayList<String> listCarros = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autonomia_total);

        carroNome = (TextView) findViewById(R.id.nomeCarro);
        km = (TextView) findViewById(R.id.kmPercorrido);
        combustivel = (TextView) findViewById(R.id.qtdCombustivel);
        resultTotal = (TextView) findViewById(R.id.resultTotal);


        layoutDinamico = (LinearLayout) findViewById(R.id.layoutResultado);
    }

    public void calcular(View view) {

        resultTotal.setText("");

        Double KmCarro =  ( Double.parseDouble( km.getText().toString())  / Double.parseDouble( combustivel.getText().toString() ) );

        String nome = carroNome.getText().toString()+" Km/L "+KmCarro;

        listCarros.add(nome);

       Double KmMedio =  ( Double.parseDouble( km.getText().toString())  / Double.parseDouble( combustivel.getText().toString() )  ) / listCarros.size();




        resultTotal.setText( "Consumo Medio da Forta: "+String.valueOf(KmMedio));
        clean();

        for (int i = 0; i < listCarros.size(); i++) {
            TextView tx = new TextView(this);
            tx.setText(listCarros.get(i).toString());
            layoutDinamico.addView(tx);
        }
        limparDados(view);

    }
    private void clean(){
        layoutDinamico.removeAllViews();
    }

    public void limparDados(View view) {

        carroNome.setText("");
        combustivel.setText("");
        km.setText("");

    }
}
