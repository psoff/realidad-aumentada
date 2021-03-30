package com.wikitude.wikitudestudioandroidapptemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class actprincipal extends AppCompatActivity implements View.OnClickListener {

    private Button botcam,botayuda;
    private TextView texto;
    private EditText descripcion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        setTheme(R.style.Theme_AppCompat);
        botcam=(Button) findViewById(R.id.botcam);
        botayuda=(Button) findViewById(R.id.botayuda);
        texto=(TextView) findViewById(R.id.texto);
        descripcion = (EditText)findViewById(R.id.descripcion);
        botcam.setOnClickListener(this);
        botayuda.setOnClickListener (this);

    }


    public void onClick(View view) {
        Intent intent = new Intent(this, SampleCamActivity.class);
        if(view == botayuda){
        descripcion.setVisibility(View.VISIBLE);
        }
        if(view == botcam){
            startActivity(intent);
        }

    }



}


