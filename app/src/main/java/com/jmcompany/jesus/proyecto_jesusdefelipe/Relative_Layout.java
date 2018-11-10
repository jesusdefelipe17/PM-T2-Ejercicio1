package com.jmcompany.jesus.proyecto_jesusdefelipe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Relative_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative__layout);
    }

    public void norte(View view) {

        Context context = getApplicationContext();
        CharSequence text = "Norte";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void noroeste(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Noroeste";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void oeste(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Oeste";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void suroeste(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Suroeste";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sur(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Sur";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void centro(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Centro";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void noreste(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Noreste";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void este(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Este";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sureste(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Sureste";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
