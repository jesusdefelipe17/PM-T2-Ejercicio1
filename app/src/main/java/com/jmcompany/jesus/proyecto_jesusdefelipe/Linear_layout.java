package com.jmcompany.jesus.proyecto_jesusdefelipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Linear_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }
    public void cambiarActivity(View view) {

        Intent intent = new Intent(this,Relative_Layout.class);
        startActivity(intent);
    }
}
