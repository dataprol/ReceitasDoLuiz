package com.example.treinamento.receitasdoluiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class ModoDePreparo extends AppCompatActivity {

    int msgCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i("PROJETO Modo De Preparo", "Invocando o onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_de_preparo);

        // Recebe o endereço web através de Intent
        Intent intencao = getIntent();
        String msgURL = intencao.getStringExtra("URL");
        msgCat = intencao.getIntExtra("Categoria", 0);

        // Carrega página pelo URL informado
        WebView meuWebView = (WebView) findViewById(R.id.webReceita);
        meuWebView.loadUrl(msgURL);

        // Para retornar à activity antecessora, sem perder dados.
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    // Para retornar à activity antecessora, sem perder dados.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

    @Override
    protected void onPause() {
        Log.i("PROJETO Modo De Preparo", "Invocando o onPause...");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        Log.i("PROJETO Modo De Preparo", "Invocando o onRestart...");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.i("PROJETO Modo De Preparo", "Invocando o onStart...");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.i("PROJETO Modo De Preparo","Invocando o onStop...");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.i("PROJETO Modo De Preparo", "Invocando o onResume...");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.i("PROJETO Modo De Preparo", "Invocando o onDestroy...");
        super.onDestroy();
    }
   

}
