package senac.com.br.facudade.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import senac.com.br.facudade.R;

public class AppTela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_tela2);
    }

    public void next(View view) {
        startActivity( new Intent(this, AppTela3Activity.class));
    }
}
