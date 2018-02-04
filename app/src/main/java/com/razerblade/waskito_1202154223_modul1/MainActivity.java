package com.razerblade.waskito_1202154223_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public final static String warung ="warung";
    public final static String nama_makanan ="nama_makanan";
    public final static String jumlah1 ="jumlah";
    public final static String harga ="harga";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button eatbus = (Button) findViewById(R.id.button);
        Button abnormal=(Button) findViewById(R.id.button2);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText makan = (EditText)findViewById(R.id.makan);
                EditText jumlah = (EditText)findViewById(R.id.jumlah);
                if(makan.getText().toString().equals("")||jumlah.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Di Isi Dulu Say", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    String makanan=makan.getText().toString();
                    String jumlaha = jumlah.getText().toString();
                    intent.putExtra(warung,"EatBus");
                    intent.putExtra(nama_makanan,makanan);
                    intent.putExtra(jumlah1,jumlaha);
                    intent.putExtra(harga,"50000");
                    startActivity(intent);
                }
            }
        });
        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText makan = (EditText)findViewById(R.id.makan);
                EditText jumlah = (EditText)findViewById(R.id.jumlah);
                if(makan.getText().toString().equals("")||jumlah.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Di Isi Dulu Say", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    String makanan=makan.getText().toString();
                    String jumlaha = jumlah.getText().toString();
                    intent.putExtra(warung,"Abnormal");
                    intent.putExtra(nama_makanan,makanan);
                    intent.putExtra(jumlah1,jumlaha);
                    intent.putExtra(harga,"30000");
                    startActivity(intent);
                }
            }
        });

    }







    public void abnormal(View view) {
    }

    public void eatbus(View view) {
    }
}
