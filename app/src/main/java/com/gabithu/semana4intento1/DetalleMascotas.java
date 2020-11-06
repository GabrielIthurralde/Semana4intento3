package com.gabithu.semana4intento1;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalleMascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascotas);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        String huesitos = parametros.getString("huesitos");
        int foto = parametros.getInt("foto");

        TextView tvnombre = (TextView) findViewById(R.id.tvnombre);
        TextView tvmegusta = (TextView) findViewById(R.id.tvmegusta);
        ImageView ivfoto = (ImageView) findViewById(R.id.ivfoto);
        tvnombre.setText(nombre);
        tvmegusta.setText(huesitos);
        ivfoto.setImageResource(foto);
    }


}