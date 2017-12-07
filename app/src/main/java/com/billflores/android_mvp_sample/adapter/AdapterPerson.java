package com.billflores.android_mvp_sample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.billflores.android_mvp_sample.R;
import com.billflores.android_mvp_sample.data.entity.Person;

import java.util.ArrayList;

/**
 * Created by bill on 5/10/17.
 */

public class AdapterPerson extends RecyclerView.Adapter<AdapterPerson.MyViewholder>{

    public ArrayList<Person> personArrayList;

    public AdapterPerson(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_person_row,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        Person person=personArrayList.get(position);
        holder.onbind(person);
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder {
        TextView textViewName,textViewDni;
        public MyViewholder(View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.textViewName);
            textViewDni=itemView.findViewById(R.id.textViewDni);
        }
        public void onbind(Person person){
            textViewName.setText(person.getName());
            textViewDni.setText(String.valueOf(person.getDni()));

        }

    }

}
