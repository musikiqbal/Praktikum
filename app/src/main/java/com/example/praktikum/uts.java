package com.example.praktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class uts extends AppCompatActivity {
    EditText absen, praktik, uts, uas;
    TextView angka, huruf, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);

        absen=findViewById(R.id.absen);
        praktik=findViewById(R.id.praktik);
        uts=findViewById(R.id.uts);
        uas=findViewById(R.id.uas);
        angka=findViewById(R.id.angka);
        huruf=findViewById(R.id.huruf);
        status=findViewById(R.id.status);
    }

    public void hitung(View view) {

        String nabsen = absen.getText().toString().trim();
        String npraktik = praktik.getText().toString().trim();
        String nuts = uts.getText().toString().trim();
        String nuas = uas.getText().toString().trim();

        int q = Integer.parseInt(nabsen);
        int w = Integer.parseInt(npraktik);
        int e = Integer.parseInt(nuts);
        Integer r = Integer.parseInt(nuas);

        double nilai = (0.15 * q) + (0.25 * w) + (0.25 * e) + (0.35 * r);
        angka.setText(""+nilai);

             if (nilai >= 80) {
                 huruf.setText("A");
                 status.setText("LULUS");
                 Toast.makeText(this,"Selamat Anda Lulus", Toast.LENGTH_LONG).show();
                 status.setBackgroundResource(R.color.green);
                 } else if (nilai >= 70) {
                   huruf.setText("B");
                 status.setText("LULUS");
                 Toast.makeText(this,"Selamat Anda Lulus", Toast.LENGTH_LONG).show();
                 status.setBackgroundResource(R.color.green);
                 } else if (nilai >= 60) {
                   huruf.setText("C");
                 status.setText("LULUS");
                 Toast.makeText(this,"Selamat Anda Lulus", Toast.LENGTH_LONG).show();
                 status.setBackgroundResource(R.color.green);
                 } else if (nilai >= 45) {
                   huruf.setText("D");
                 status.setText("PERBAIKAN");
                 Toast.makeText(this,"Anda Harus Perbaikan", Toast.LENGTH_LONG).show();
                 status.setBackgroundResource(R.color.yellow);
                 } else {
                   huruf.setText("E");
                 status.setText("MENGULANG");
                 Toast.makeText(this,"Anda Harus Mengulang", Toast.LENGTH_LONG).show();
                 status.setBackgroundResource(R.color.red);
                           }

                }
    }
