package com.example.login;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        EditText username = findViewById(R.id.text_edUsername);
        EditText password = findViewById(R.id.text_edPassword);
        EditText email = findViewById(R.id.text_edEmail);
        EditText phone = findViewById(R.id.text_edPhone);
        ImageButton registerFacebook = findViewById(R.id.btnFacebook);
        ImageButton registerTwitter = findViewById(R.id.btnTwitter);
        ImageButton registerGoogle = findViewById(R.id.btnGoogle);
        ImageButton registerAccount = findViewById(R.id.btnCreateRegis);

        registerAccount.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                String nama = username.getText().toString().trim();
                String pass = password.getText().toString().trim();
                String gmail = email.getText().toString().trim();
                String nomor = phone.getText().toString().trim();
                if (TextUtils.isEmpty(nama)) {
                    username.setError("Username is required!");
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    password.setError("Password is required!");
                    return;
                }
                if (TextUtils.isEmpty(gmail)) {
                    email.setError("Email is required!");
                    return;
                }
                if (TextUtils.isEmpty(nomor)) {
                    phone.setError("Phone number is required!");
                    return;
                }else {
                    Toast.makeText(Register.this, "Successfully Register", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(Register.this, Calculator.class);
                    Intent intent = new Intent(Register.this, RecyclerViewActivity.class);
                    intent.putExtra("username", username.getText().toString());
                    startActivity(intent);
                }

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void login(View view) {
            Intent intent = new Intent(Register.this, Login.class);
            startActivity(intent);
    }

    public void RegisterAccount(View view) {

    }
}