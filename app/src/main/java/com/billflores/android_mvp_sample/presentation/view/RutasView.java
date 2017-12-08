package com.billflores.android_mvp_sample.presentation.view;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.billflores.android_mvp_sample.R;
import com.billflores.android_mvp_sample.domain.entity.Rutas;
import com.billflores.android_mvp_sample.presentation.adapter.AdapterRutas;
import com.billflores.android_mvp_sample.presentation.MainActivity;
import com.billflores.android_mvp_sample.presentation.presenter.RutasPresenter;
import com.billflores.android_mvp_sample.presentation.presenter.RutasPresenterInterface;

import java.util.ArrayList;

public class RutasView extends AppCompatActivity implements RutasViewInterface{

    private RecyclerView recyclerViewRutas;
    private AdapterRutas adapterRutas;
    private ProgressDialog progress;
    private RutasPresenterInterface rutasPresenterInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewRutas=(RecyclerView) findViewById(R.id.recyclerViewRutas);

        //progressDialog
        progress = new ProgressDialog(RutasView.this);
        progress.setMessage("Cargando ...");
        progress.setCanceledOnTouchOutside(false);


        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewRutas.setLayoutManager(linearLayoutManager);

        rutasPresenterInterface= new RutasPresenter(this);
        rutasPresenterInterface.getAllData("20170923",1);

    }

    @Override
    public void showList(ArrayList<Rutas> rutasArrayList){
        adapterRutas= new AdapterRutas(rutasArrayList);
        recyclerViewRutas.setAdapter(adapterRutas);
    }


    @Override
    public void showProgressDialog() {
        progress.show();

    }

    @Override
    public void hideProgressDialog() {
        progress.dismiss();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
