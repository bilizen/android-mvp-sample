package com.billflores.android_mvp_sample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.billflores.android_mvp_sample.R;
import com.billflores.android_mvp_sample.adapter.AdapterPerson;
import com.billflores.android_mvp_sample.entity.Person;

import java.util.ArrayList;

public class MainActivityView extends AppCompatActivity implements MainActivity.View, View.OnClickListener {

    private TextView textViewResult;
    private MainActivity.Presenter presenter;
    private EditText editTextNum;
    private Button buttonCalcular;
    private RecyclerView recyclerViewPerson;
    private AdapterPerson adapterPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult=(TextView) findViewById(R.id.textViewResult);
        editTextNum=(EditText) findViewById(R.id.editTextNum);
        buttonCalcular= (Button) findViewById(R.id.buttonCalcular);
        recyclerViewPerson=(RecyclerView) findViewById(R.id.recyclerViewPerson);


        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewPerson.setLayoutManager(linearLayoutManager);

        presenter= new MainAcitivityPresenter(this);
        buttonCalcular.setOnClickListener(this);
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Person("edwin",9829232));
        personArrayList.add(new Person("bill",9829232));
        personArrayList.add(new Person("gian",9829232));
        personArrayList.add(new Person("joel",9829232));
        personArrayList.add(new Person("jair",9829232));
        showList(personArrayList);

    }

    @Override
    public void showresult(String result) {
        textViewResult.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this,error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showList(ArrayList<Person> arrayList) {
        recyclerViewPerson.setAdapter();
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonCalcular){
            presenter.alcuadrado(editTextNum.getText().toString());
        }
    }



}
