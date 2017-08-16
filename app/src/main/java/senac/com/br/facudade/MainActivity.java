package senac.com.br.facudade;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import senac.com.br.facudade.activity.AlunoActivity;
import senac.com.br.facudade.activity.AppTela1Activity;
import senac.com.br.facudade.activity.AutonomiaTotal;
import senac.com.br.facudade.activity.CalculadoraHistoricoActivity;
import senac.com.br.facudade.activity.CicloDeVidaActivity;
import senac.com.br.facudade.activity.PrecoJustoActivity;
import senac.com.br.facudade.activity.PrecoMiasJustoActivity;
import senac.com.br.facudade.activity.PrincipalActivity;
import senac.com.br.facudade.activity.VotaTela1Activity;
import senac.com.br.facudade.activity.VotarActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Paulo Jorge de Oliveira", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder al = new AlertDialog.Builder(this);
            al.setTitle("OK");
            al.setMessage("ok");
            al.setIcon(R.drawable.ic_menu_send);
            //al.setNegativeButton("nao", null);

            al.setPositiveButton("Nao", null);
            al.setNeutralButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            al.show();
            //super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.aprovado) {
            Intent it = new Intent(this, AlunoActivity.class);
            startActivity(it);
        } else if (id == R.id.juros) {
            Intent it = new Intent(this, PrecoJustoActivity.class);
            startActivity(it);

        } else if (id == R.id.ciclo_de_vida) {
            Intent it = new Intent(this, CicloDeVidaActivity.class);
            startActivity(it);

        } else if (id == R.id.telasApp) {
            Intent it = new Intent(this, AppTela1Activity.class);
            startActivity(it);

        } else if (id == R.id.nav_share) {
            Intent it = new Intent(this, PrincipalActivity.class);
            startActivity(it);

        }
        else if (id == R.id.nav_autonomia) {
            Intent it = new Intent(this, AutonomiaTotal.class);
            startActivity(it);

        }
        else if (id == R.id.nav_calc_hist) {
            Intent it = new Intent(this, CalculadoraHistoricoActivity.class);
            startActivity(it);

        }else if (id == R.id.nav_precoMais_justo) {
            Intent it = new Intent(this, PrecoMiasJustoActivity.class);
            startActivity(it);

        }
        else if (id == R.id.nav_votar) {
        Intent it = new Intent(this, VotarActivity.class);
        startActivity(it);

         }
        else if (id == R.id.nav_notas) {
            Intent it = new Intent(this, VotaTela1Activity.class);
            startActivity(it);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
