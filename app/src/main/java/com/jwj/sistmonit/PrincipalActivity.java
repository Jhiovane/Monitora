package com.jwj.sistmonit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PrincipalActivity extends AppCompatActivity {

    private View painel, erros, dados, relatorio;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        setContentView(R.layout.activity_principal);

        painel = findViewById(R.id.botao_painel);
        erros = findViewById(R.id.botao_falha);
        dados = findViewById(R.id.botao_dados);
        relatorio = findViewById(R.id.botao_relatorio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.principal_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuItemExcluir:
                return true;
            case R.id.menuItemSair:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void irTela1 (View view){
        Intent intent = new Intent(this, PainelActivity.class);
        startActivity(intent);
    }

    public void irTela2 (View view){
        Intent intent = new Intent(this, ErrosActivity.class);
        startActivity(intent);
    }

    public void irTela3 (View view){
        Intent intent = new Intent(this, DadosActivity.class);
        startActivity(intent);
    }

    public void irTela4 (View view){
        Intent intent = new Intent(this, RelatorioActivity.class);
        startActivity(intent);
    }

}
