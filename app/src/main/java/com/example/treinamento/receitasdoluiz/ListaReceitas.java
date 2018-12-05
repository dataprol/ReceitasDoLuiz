package com.example.treinamento.receitasdoluiz;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URL;
import java.util.ArrayList;

public class ListaReceitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_receitas);

        Intent intencao = getIntent();
        int msgCategoria = intencao.getIntExtra( "Categoria", 0 );

        final ArrayList<Receitas> minhasReceitas = new ArrayList<Receitas>();

        if( msgCategoria == 0 ) {
            minhasReceitas.add(new Receitas("Bolo de Laranja", "12 fatias", 60, "https://www.panelinha.com.br/receita/Bolo-de-laranja", R.drawable.bolo_laranja_01 ));
            minhasReceitas.add(new Receitas("Bolo de Cenoura", "6 porções", 40, "https://www.panelinha.com.br/receita/Bolo-de-cenoura-com-cobertura-de-chocolate", R.drawable.bolo_cenoura_01 ));
            minhasReceitas.add(new Receitas("Bolo Suflê de Chocolate", "6 porções", 40, "https://www.panelinha.com.br/receita/Bolo-sufle-de-chocolate", R.drawable.bolo_chocolate_01 ));
            minhasReceitas.add(new Receitas("Bolo Gelado de Coco", "6 porções", 35, "https://www.panelinha.com.br/blog/pitadas/Bolo-Gelado-de-Coco-massa-esponjosa", R.drawable.bolo_coco_01 ));
            minhasReceitas.add(new Receitas("Bolo de Milho em Caneca", "4 porções", 45, "https://www.panelinha.com.br/receita/Bolo-de-milho-de-caneca", R.drawable.bolo_milho_01 ));
        }
        if( msgCategoria == 1 ) {
            minhasReceitas.add(new Receitas("Suco de Abacaxi com Hortelã", "1 porção", 2, "https://www.panelinha.com.br/receita/Suco-de-abacaxi-com-hortela", R.drawable.suco_abacaxi_01 ));
            minhasReceitas.add(new Receitas("Suco de Manga com Limão", "2 porções", 5, "https://www.panelinha.com.br/receita/Suco-de-manga-com-limao", R.drawable.suco_manga_01 ));
            minhasReceitas.add(new Receitas("Suco de Cinco Vegetais", "1,2 litro", 5, "https://www.panelinha.com.br/receita/Suco-de-5-vegetais-caseiro", R.drawable.suco_vegetais_01 ));
            minhasReceitas.add(new Receitas("Suco de Morango com Gengibre", "1 porção", 5, "https://www.panelinha.com.br/receita/Suco-energizante-de-morango-com-gengibre", R.drawable.suco_morango_01 ));
            minhasReceitas.add(new Receitas("Suco de Melancia com Limão", "1 porção", 60, "https://www.panelinha.com.br/receita/Suco-de-melancia-com-limao", R.drawable.suco_melancia_01 ));
        }
        if( msgCategoria == 2 ) {
            minhasReceitas.add(new Receitas("Sorvete de Abacate", "4 porções", 120, "http://www.panelinha.com.br/receita/Sorvete-de-abacate", R.drawable.lanche_sorvete_abacate_01 ));
            minhasReceitas.add(new Receitas("Sanduíche de Abacate Bacon e Ovos", "2 porções", 5, "http://www.panelinha.com.br/receita/Sanduiche-de-abacate-bacon-e-ovo", R.drawable.lanche_sanduiche_abacate_01 ));
            minhasReceitas.add(new Receitas("Sopa de Cenoura", "2 porões", 60, "http://www.panelinha.com.br/receita/Sopa-de-cenoura-com-curry-e-leite-de-coco", R.drawable.lanche_sopa_ceboura_01 ));
            minhasReceitas.add(new Receitas("Arroz à Grega", "12 porções", 10, "https://www.panelinha.com.br/receita/Arroz-a-Grega", R.drawable.lanche_arroz_grega_01 ));
            minhasReceitas.add(new Receitas("Sanduíche de Salmão", "1 porção", 3, "http://www.panelinha.com.br/receita/Sanduiche-de-salmao-cream-cheese-e-rucula", R.drawable.lanche_sanduiche_salmao_01 ));
        }

        // Vincula a ListView à matriz e popula ela
        ListView listaReceitas = (ListView) findViewById( R.id.lvListaReceitas );
        listaReceitas.setAdapter( new Receitas_Adaptador(this, minhasReceitas ) );

        // Cria um evento para tratar o toque sobre itens da lista
        listaReceitas.setOnItemClickListener( new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick( AdapterView<?> parent, View view, int position, long id ) {

                Toast.makeText( getApplicationContext(), getString(R.string.txtCarregandoReceita)+" "+minhasReceitas.get(position).getNome(), Toast.LENGTH_LONG ).show();

                Intent intencao = new Intent( ListaReceitas.this, ModoDePreparo.class );
                intencao.putExtra( "URL", minhasReceitas.get(position).getUrl() );
                intencao.putExtra( "Categoria", position );
                startActivity( intencao );

            }

        } );

    }

}
