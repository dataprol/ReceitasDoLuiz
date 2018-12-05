package com.example.treinamento.receitasdoluiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Receitas_Adaptador extends ArrayAdapter<Receitas> {

        public Receitas_Adaptador(@NonNull Context context, @NonNull List<Receitas> objects ) {
            super( context, 0, objects );
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent ) {

            View listItemView = convertView;

            if( listItemView == null ){
                listItemView = LayoutInflater.from(getContext()).inflate( R.layout.activity_item_da__lista,
                                                                            parent,
                                                                            false );
            }

            Receitas atual = getItem( position );

            ImageView imagem = (ImageView) listItemView.findViewById(R.id.imageView);
            TextView nome = (TextView) listItemView.findViewById(R.id.txtNome);
            TextView categoria = (TextView) listItemView.findViewById(R.id.txtPorcao);
            TextView tempo = (TextView) listItemView.findViewById(R.id.txtTempo);

            imagem.setImageResource( atual.getImagemID() );
            nome.setText( atual.getNome() );
            categoria.setText( atual.getPorcoes() );
            tempo.setText( atual.getTempo() );

            return listItemView;
        }
}
