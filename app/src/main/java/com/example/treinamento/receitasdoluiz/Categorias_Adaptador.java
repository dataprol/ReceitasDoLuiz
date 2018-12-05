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

public class Categorias_Adaptador extends ArrayAdapter<Categorias> {

    public Categorias_Adaptador(@NonNull Context context, @NonNull List<Categorias> objects ) {
        super( context, 0, objects );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent ) {

        View listItemView = convertView;

        if( listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate( R.layout.itens_principal,
                                                                        parent,
                                                                        false );
        }

        Categorias atual = getItem( position );

        ImageView imagem = (ImageView) listItemView.findViewById(R.id.imageViewCateg);
        TextView nome = (TextView) listItemView.findViewById(R.id.txtCateg);

        imagem.setImageResource( atual.getImagemID() );
        nome.setText( atual.getNome() );

        return listItemView;
    }

}
