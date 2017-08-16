package senac.com.br.facudade.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import senac.com.br.facudade.R;

public class CalculadoraHistoricoActivity extends AppCompatActivity {

    TextView num1, num2, hist;
    ArrayList<String> historico;
    LinearLayout layoutDinamico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_historico);

        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
        layoutDinamico = (LinearLayout) findViewById(R.id.layoutResultado);
        historico = new ArrayList<>();
    }

    public void Somar(View view) {

        try {


            String aux = null;
            Integer soma = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
            aux = num1.getText().toString() + " + " + num2.getText().toString() + " = " + soma.toString();


            historico.add(aux);

            clean();

            for (int i = 0; i < historico.size(); i++) {
                TextView tx = new TextView(this);
                tx.setText(historico.get(i).toString());
                layoutDinamico.addView(tx);
            }
        } catch (Exception e) {
            Toast.makeText(this, "Insira o num 1 depois o num 2 e clique no botao que desejar", Toast.LENGTH_SHORT).show();
        }


    }

    public void Multiplicar(View view) {

        try {
            String aux = null;
            Integer soma = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
            aux = num1.getText().toString() + " * " + num2.getText().toString() + " = " + soma.toString();


            historico.add(aux);

            clean();

            for (int i = 0; i < historico.size(); i++) {
                TextView tx = new TextView(this);
                tx.setText(historico.get(i).toString());
                layoutDinamico.addView(tx);
            }
        } catch (Exception e) {
            Toast.makeText(this, "Insira o num 1 depois o num 2 e clique no botao que desejar", Toast.LENGTH_SHORT).show();
        }


    }

    public void Dmininuir(View view) {
        try {
            String aux = null;
            Integer soma = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
            aux = num1.getText().toString() + " - " + num2.getText().toString() + " = " + soma.toString();


            historico.add(aux);

            clean();

            for (int i = 0; i < historico.size(); i++) {
                TextView tx = new TextView(this);
                tx.setText(historico.get(i).toString());
                layoutDinamico.addView(tx);
            }
        } catch (Exception e) {
            Toast.makeText(this, "Insira o num 1 depois o num 2 e clique no botao que desejar", Toast.LENGTH_SHORT).show();
        }

    }

    public void Dividir(View view) {
        try {
            String aux = null;
            Integer soma = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
            aux = num1.getText().toString() + " / " + num2.getText().toString() + " = " + soma.toString();


            historico.add(aux);

            clean();

            for (int i = 0; i < historico.size(); i++) {
                TextView tx = new TextView(this);
                tx.setText(historico.get(i).toString());
                layoutDinamico.addView(tx);
            }
        } catch (Exception e) {
            Toast.makeText(this, "Insira o num 1 depois o num 2 e clique no botao que desejar", Toast.LENGTH_SHORT).show();
        }
    }

    private void clean() {
        layoutDinamico.removeAllViews();
        num1.setText("");
        num2.setText("");
    }


}
