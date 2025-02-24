package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        TextView tvName = findViewById(R.id.tvMyCalculator);
        TextView tvAbsen = findViewById(R.id.tvMyAbsen);

        String name = getIntent().getStringExtra("name");
        String absen = getIntent().getStringExtra("absen");

        tvName.setText("Calculator " + name);
        tvAbsen.setText(absen);

        EditText angka1 = findViewById(R.id.EditText1);
        EditText angka2 = findViewById(R.id.EditText2);
        TextView angka3 = findViewById(R.id.EditText3);

        findViewById(R.id.btnPlus).setOnClickListener(v -> {
            String satu = angka1.getText().toString();
            String dua = angka2.getText().toString();
            if (TextUtils.isEmpty(satu)) {
                angka1.setError("Enter first number");
                return;
            }
            if (TextUtils.isEmpty(dua)) {
                angka2.setError("Enter second number");
                return;
            }

            int nilai1 = Integer.parseInt(satu);
            int nilai2 = Integer.parseInt(dua);
            int hasil = nilai1 + nilai2;
            angka3.setText("Hasil: " + hasil);
        });

        // Similar implementations for other operations (subtract, multiply, divide)
    }

    public void back(View view) {
        Intent intent = new Intent(Calculator.this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}
