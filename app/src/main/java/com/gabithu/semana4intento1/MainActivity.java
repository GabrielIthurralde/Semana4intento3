package com.gabithu.semana4intento1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaMascotas = (RecyclerView) findViewById(R.id.rvmascota);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarlista();
        inicializaradaptador();

        /*ListView lstmascotas = (ListView) findViewById(R.id.lstmascotas);

        lstmascotas.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mismascotas));

        lstmascotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalleMascotas.class);


                intent.putExtra("nombre", mascotas.get(position).getNombre());
                intent.putExtra("huesitos", mascotas.get(position).getMegusta());
                intent.putExtra("foto", mascotas.get(position).getFoto());
                startActivity(intent);
            }
        });*/
    }

    public void inicializaradaptador(){
        MascotaAdaptador adaptador= new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarlista() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("ShinShan", "5 huesitos", R.drawable.bicolor_dog));
        mascotas.add(new Mascota("Oscurin", "4 huesitos", R.drawable.blacky_dos));
        mascotas.add(new Mascota("Hipocondrio", "3 huesitos", R.drawable.corona_dog));

    }

    public void sendMessage(View view) {
        // Do something in response to button click
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}



/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
} */