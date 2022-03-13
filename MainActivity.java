package com.example.tugas3vikriafanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_vikriafanda);
    }

    public void clickrs(View view) {
        //gambar rs di click
        Intent i = new Intent(this,rs.class);
        startActivity(i);
    }
}