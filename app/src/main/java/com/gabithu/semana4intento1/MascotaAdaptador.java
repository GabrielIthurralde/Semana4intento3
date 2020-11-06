package com.gabithu.semana4intento1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<com.gabithu.semana4intento1.MascotaAdaptador.MascotaViewHolder>
{

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;

    }


    ArrayList<Mascota> mascotas;

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);

        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {

        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.ivfotocv.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvnombrecv.setText(mascota.getNombre());
        mascotaViewHolder.tvmegustacv.setText(mascota.getMegusta());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivfotocv;
        private TextView tvnombrecv;
        private TextView tvmegustacv;


        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);

            ivfotocv = (ImageView) itemView.findViewById(R.id.ivfotocv);
            tvnombrecv = (TextView) itemView.findViewById(R.id.tvnombrecv);
            tvmegustacv = (TextView) itemView.findViewById(R.id.tvmegustacv);

        }
    }


}
