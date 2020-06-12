package com.victoribarra.mapita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {
    private ImageButton Soriana;
    private ImageButton iglesia;
    private ImageButton tortilleria;
    private ImageButton cinemex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Soriana     = findViewById(R.id.imgbsoriana);
        iglesia     = findViewById(R.id.imgbiglesia);
        tortilleria = findViewById(R.id.imgbtortilleria);
        cinemex     = findViewById(R.id.imgbcinemex);
    }

    public void soriana (View view){
        LatLng posicion = new LatLng(25.545,-103.406);
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("pos",posicion );
        i.putExtra("name","soriana");
        startActivity(i);
    }

    public void tortilleria (View view){
        LatLng posicion = new LatLng(25.556302,-103.403062);
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("pos",posicion );
        i.putExtra("name","tortilleria");
        startActivity(i);
    }

    public void cinemex (View view){
        LatLng posicion = new LatLng(25.545848,-103.395767);
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("pos",posicion );
        i.putExtra("name","cinemex");
        startActivity(i);
    }

    public void iglesia (View view){
        LatLng posicion = new LatLng(25.545868,-103.400294);
        Intent i = new Intent(this,MapsActivity.class);
        i.putExtra("pos",posicion );
        i.putExtra("name","iglesia");
        startActivity(i);
    }
}