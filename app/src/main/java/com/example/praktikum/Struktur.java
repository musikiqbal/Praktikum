package com.example.praktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Struktur extends AppCompatActivity {

    EditText nilai;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struktur);


        nilai=findViewById(R.id.nilai);
        hasil=findViewById(R.id.hasil);
    }

    public void status(View view) {
        int num = Integer.parseInt(nilai.getText(). toString());

        if (num>=60){
            hasil.setText("LULUS");
            Toast.makeText(this,"Selamat Anda Lulus", Toast.LENGTH_LONG).show();
            hasil.setBackgroundResource(R.color.teal_700);
        }else{
            hasil.setText("GAGAL");
            Toast.makeText(this,"Maaf Anda Tidak Lulus", Toast.LENGTH_LONG).show();
            hasil.setBackgroundResource(R.color.red);
        }
    }
}