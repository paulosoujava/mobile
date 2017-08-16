package senac.com.br.facudade.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import senac.com.br.facudade.R;

public class ResultadoVotar123Activity extends AppCompatActivity {

    TextView  txN1, txN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_votar123);

        Bundle param = getIntent().getExtras();


        String nome2 = param.getString("nome_tela1");
        int n1 = param.getInt("pn1_tela1");
        int n2 = param.getInt("pn2_tela1");
        int n3 = param.getInt("pn3_tela1");

        String nome1 = param.getString("nome_tela2");
        int n4 = param.getInt("pn1_tela2");
        int n5 = param.getInt("pn2_tela2");
        int n6 = param.getInt("pn3_tela2");


        txN1 = (TextView) findViewById(R.id.nota1);


        txN2 = (TextView) findViewById(R.id.nota2);


        int totalMedia1 =  (n1+n2+n3 ) / 3;
        int totalMedia2 =  (n4+n5+n6 ) / 3;


        txN1.setText(  "Em "+nome2 + " voce esta "+ ( totalMedia1 >= 6? " Aprovado" : " Reprovado" ) + " Com a media "+ totalMedia1 );

            int passou =  (totalMedia1 + totalMedia2 ) / 2  ;

        String aprovado = "reprovado";
           if( passou >= 6 ){
               aprovado = "aprovado";
           }

        txN2.setText(  "\n\n\n Em  "+nome1 +" voce esta "+ ( totalMedia2 >= 6? " Aprovado" : " Reprovado" )  +" Com a media "+ totalMedia2+" \n\n\n"+
                " Sendo assim voc esta " + aprovado + " Media "+ passou);


    }
}
