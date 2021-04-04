package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private EditText etName, etNIM, etIPK;
    private String sValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btn_submit);
        etName = findViewById(R.id.et_name);
        etNIM = findViewById(R.id.et_nim);
        etIPK = findViewById(R.id.et_ipk);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    String sName = etName.getText().toString();
                    String sNIM = etNIM.getText().toString();
                    String sIPK = etIPK.getText().toString();

                    double ipk = Double.parseDouble(sIPK);
                    if (ipk > 3.66 && ipk <= 4.00) {
                        sValue = "A";
                    } else if (ipk > 3.33 && ipk <= 3.66) {
                        sValue = "A-";
                    } else if (ipk > 3.00 && ipk <= 3.33) {
                        sValue = "B+";
                    } else if (ipk > 2.66 && ipk <= 3.00) {
                        sValue = "B";
                    } else if (ipk > 2.33 && ipk <= 2.66) {
                        sValue = "B-";
                    } else if (ipk > 2.00 && ipk <= 2.33) {
                        sValue = "C+";
                    } else if (ipk > 1.66 && ipk <= 2.00) {
                        sValue = "C";
                    } else if (ipk > 1.33 && ipk <= 1.66) {
                        sValue = "C-";
                    } else if (ipk > 1.00 && ipk <= 1.33) {
                        sValue = "D+";
                    } else {
                        sValue = "D";
                    }

                    Intent i = new Intent(MainActivity.this, ReadActivity.class);
                    i.putExtra("Name", sName);
                    i.putExtra("NIM", sNIM);
                    i.putExtra("IPK", sValue);
                    startActivity(i);

                } catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
