package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private EditText username, password;
    private ImageButton loginAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Ensure this is correct

        username = findViewById(R.id.text_edUsername);
        password = findViewById(R.id.text_edPassword);
        loginAccount = findViewById(R.id.btnCreateLogin);

        loginAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = username.getText().toString();
                String pass = password.getText().toString();

                if (TextUtils.isEmpty(nama)) {
                    username.setError("Username is required!");
                    return;
                }
                if (TextUtils.isEmpty(pass)) {
                    password.setError("Password is required!");
                    return;
                }

                if (nama.equals("Ihsan") && pass.equals("Ihsan123")) {
                    Toast.makeText(Login.this, "Successfully Login", Toast.LENGTH_SHORT).show();

                    // ✅ Correct intent to RecyclerViewActivity
                    Intent intent = new Intent(Login.this, RecyclerViewActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "There's somthing wrong, please check again!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void register(View view){
        Intent intent = new Intent(Login.this, Register.class);
        startActivity(intent);
    }
}
