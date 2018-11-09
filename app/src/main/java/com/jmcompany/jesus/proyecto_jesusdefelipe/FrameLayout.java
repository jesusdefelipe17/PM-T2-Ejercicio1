package com.jmcompany.jesus.proyecto_jesusdefelipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
    }


    public void cambiarFoto(View view) {

        ImageView goku_ssj = findViewById(R.id.goku_ssj);
        ImageView goku_ssjg = findViewById(R.id.goku_ssjg);


        if(goku_ssjg.getVisibility()==View.VISIBLE){
            goku_ssj.setVisibility(View.VISIBLE);
            goku_ssjg.setVisibility(View.INVISIBLE);
        }else{
            goku_ssj.setVisibility(View.INVISIBLE);
            goku_ssjg.setVisibility(View.VISIBLE);
        }

    }

    public void cambiarActivity(View view) {

        Intent intent = new Intent(this,Linear_layout.class);
        startActivity(intent);
    }
}
