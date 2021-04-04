package com.example.assignment2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReadActivity extends AppCompatActivity {

    private TextView tvName, tvNIM, tvIPK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        tvName = findViewById(R.id.tv_name2);
        tvNIM = findViewById(R.id.tv_nim2);
        tvIPK = findViewById(R.id.tv_ipk2);

        Bundle extras = getIntent().getExtras();
        String sName = extras.getString("Name");
        String sNIM = extras.getString("NIM");
        String sIPK = extras.getString("IPK");

        tvName.setText(sName);
        tvNIM.setText(sNIM);
        tvIPK.setText(sIPK);

    }

}
