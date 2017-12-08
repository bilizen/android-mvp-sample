package com.billflores.android_mvp_sample.presentation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.billflores.android_mvp_sample.R;
import com.billflores.android_mvp_sample.domain.entity.Rutas;

import java.util.ArrayList;

/**
 * Created by bill on 5/10/17.
 */

public class AdapterRutas extends RecyclerView.Adapter<AdapterRutas.MyViewholder>{

    public ArrayList<Rutas> rutasArrayList;

    public AdapterRutas(ArrayList<Rutas> personArrayList) {
        this.rutasArrayList = personArrayList;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_rutas_row,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        Rutas rutas=rutasArrayList.get(position);
        holder.onbind(rutas);
    }

    @Override
    public int getItemCount() {
        return rutasArrayList.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder {
        TextView textViewName,textViewDni;
        public MyViewholder(View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.textViewName);
            textViewDni=itemView.findViewById(R.id.textViewDni);
        }
        public void onbind(Rutas rutas){
            textViewName.setText(rutas.getName());
            textViewDni.setText(String.valueOf(rutas.getId()));

        }

    }

}
