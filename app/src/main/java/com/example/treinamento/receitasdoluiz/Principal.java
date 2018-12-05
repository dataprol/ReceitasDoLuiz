package com.example.treinamento.receitasdoluiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/*
Guia de receitas:
Faça uma aplicativo que possua três categorias de receitas. Para cada categoria, no mínimo, 5 receitas.
As receitas devem ser exibidas em uma Listview e, cada receita, em uma nova Activity.
Cada receita deve possui ingrediente, modo de preparo e uma foto.
*/
public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_principal );

        // Cria matriz e adiciona itens para montar a lista de categorias
        final ArrayList<Categorias> alCategoriaReceita = new ArrayList<>();

        alCategoriaReceita.add( new Categorias( getString(R.string.txtCategBolos), R.drawable.representacao_bolos ) );
        alCategoriaReceita.add( new Categorias( getString(R.string.txtCategBebidas), R.drawable.representacao_bebidas ) );
        alCategoriaReceita.add( new Categorias( getString(R.string.txtCategLanches), R.drawable.representacao_lanches ) );

        // Vincula a ListView à matriz e popula ela
        ListView listaCategorias = (ListView) findViewById( R.id.lvListaCategorias );
        listaCategorias.setAdapter( new Categorias_Adaptador(this, alCategoriaReceita ) );

        // Cria um evento para tratar o toque sobre itens da lista
        listaCategorias.setOnItemClickListener( new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick( AdapterView<?> parent, View view, int position, long id ) {

                Intent intencao = new Intent( Principal.this, ListaReceitas.class );
                intencao.putExtra( "Categoria", position );
                startActivity( intencao );

            }

        } );

    }


}
