package com.example.uts_grace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_nomor;
    Button btn_daftar;
    CheckBox cb_konfirmasi;
    Spinner sp_jalur;

    String nama, nomor_pd, jalur_df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        btn_daftar = findViewById(R.id.btn_daftar);
        cb_konfirmasi = findViewById(R.id.cb_konfirmasi);

        sp_jalur = findViewById(R.id.sp_jalur);


        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = et_nama.getText().toString();
                nomor_pd = et_nomor.getText().toString();
                jalur_df = sp_jalur.getSelectedItem().toString();


                if (nama.trim().equals("")){
                    et_nama.setError("Nama Tidak Boleh Kosong");
                }
                else if (nomor_pd.trim().equals("")){
                    et_nomor.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("Var_nama", String.valueOf(nama));
                    intent.putExtra("Var_Nopendaftaran", String.valueOf(nomor_pd));
                    intent.putExtra("Var_JalurPendaftaran", String.valueOf(jalur_df));
                    startActivity(intent);
                }


            }
        });

        cb_konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_konfirmasi.isChecked()) {
                    Toast.makeText(MainActivity.this, "Terkonfirmasi", Toast.LENGTH_SHORT).show();
                } else if (!cb_konfirmasi.isChecked()){
                    Toast.makeText(MainActivity.this, "Silahkan centang", Toast.LENGTH_SHORT).show();
                }
            }
        });
        

    }
}