package com.billflores.android_mvp_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityView extends AppCompatActivity implements MainActivity.View, View.OnClickListener {

    private TextView textViewName;
    private MainActivity.Presenter presenter;
    private EditText editTextNum;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewName=(TextView) findViewById(R.id.textViewName);
        editTextNum=(EditText) findViewById(R.id.editTextNum);
        buttonCalcular= (Button) findViewById(R.id.buttonCalcular);
        presenter= new MainAcitivityPresenter(this);
        buttonCalcular.setOnClickListener(this);

    }

    @Override
    public void showresult(String result) {
        textViewName.setText(result);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonCalcular){
            presenter.alcuadrado(editTextNum.getText().toString());
        }
    }
}
