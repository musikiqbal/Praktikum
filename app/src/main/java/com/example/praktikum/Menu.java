package com.example.praktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void menu1(View view) {
        Intent kalk = new Intent(this, MainActivity.class);
        startActivity(kalk);
    }

    public void menu2(View view) {
        Intent struk = new Intent(this, Struktur.class);
        startActivity(struk);
    }
}