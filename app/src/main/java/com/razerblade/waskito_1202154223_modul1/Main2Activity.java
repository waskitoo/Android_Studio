package com.razerblade.waskito_1202154223_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    private int duit =65000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String warung = intent.getStringExtra(MainActivity.warung);
        String makanan = intent.getStringExtra(MainActivity.nama_makanan);
        String jumlah2 = intent.getStringExtra(MainActivity.jumlah1);
        String harga = intent.getStringExtra(MainActivity.harga);

        TextView warungTextview = (TextView) findViewById(R.id.warung);
        TextView makananTextview = (TextView) findViewById(R.id.namaMakanan);
        TextView jumlahTextview = (TextView) findViewById(R.id.jumlah);
        TextView hargaTextview = (TextView) findViewById(R.id.Harga);
        int jumlahbenar = Integer.parseInt(harga)*Integer.parseInt(jumlah2);
        warungTextview.setText(warung);
        makananTextview.setText(makanan);
        jumlahTextview.setText(jumlah2);
        if(duit > jumlahbenar){
            Toast.makeText(getApplicationContext(), "Cie Punya duit", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "Ra duwe duit pyee", Toast.LENGTH_LONG).show();
        }
        hargaTextview.setText(Integer.toString(jumlahbenar));

    }
}
