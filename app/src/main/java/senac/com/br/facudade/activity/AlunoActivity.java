package senac.com.br.facudade.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import senac.com.br.facudade.R;

public class AlunoActivity extends AppCompatActivity {

    EditText nota1;
    EditText nota2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        result = (TextView) findViewById(R.id.idResultado);

    }

    public void calcular(View view) {

        String  passou =   "Opss, Reprovado, estude mais e saja grande!";
        int res;
        try {
            res = (Integer.parseInt(String.valueOf(nota1.getText())) + Integer.parseInt(String.valueOf(nota2.getText())));
        }catch (Exception e){
            Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show();
            return;
        }
            int num = (res ) / 2;
        if( (res ) / 2 > 6  ){
            passou = "Aeeee, Passou parabéns";
        }


        result.setText("Média escolar é 6\n Ola, amigo seu resultado é :" +
                " \n"+nota1.getText() + " + " + nota2.getText()+ " = " + res +" / 2  = "+ num+ "" +
                " \n  "+ passou);

        Toast.makeText(this, "Você:"+ passou, Toast.LENGTH_SHORT).show();

    }

    public void clear(View view) {
        nota2.setText("");
        nota1.setText("");
        result.setText(" ");

    }
    public void voltar(View view) {
       finish();

    }
}
