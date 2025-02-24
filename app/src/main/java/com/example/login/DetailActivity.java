package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView tvName, tvAbsen, tvKelas, tvDeskripsi;
    private String name; // Declare at the top


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_nama_siswa);

        // Initialize TextViews
        tvName = findViewById(R.id.tvName);
        tvAbsen = findViewById(R.id.tvAbsen);
        tvKelas = findViewById(R.id.tvKelas);
        tvDeskripsi = findViewById(R.id.tvDeskripsi);  // Fix to the correct ID
        ImageView imgMovie = findViewById(R.id.imgMovie);
        name = getIntent().getStringExtra("name");






        // Get data from the Intent
        //String name = getIntent().getStringExtra("name");
        String absen = getIntent().getStringExtra("absen");
        String kelas = getIntent().getStringExtra("kelas");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        int imageResId = getIntent().getIntExtra("imageResId", 0);



        // Set the data to TextViews
        tvName.setText(name);
        tvAbsen.setText(absen);
        tvKelas.setText(kelas);
        tvDeskripsi.setText(deskripsi);  // Display description
        imgMovie.setImageResource(imageResId);
    }

    public void back(View view) {
        Intent intent = new Intent(DetailActivity.this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void buy(View view){
        Toast.makeText(DetailActivity.this, "Successfully purchased Ticket " + name, Toast.LENGTH_SHORT).show();
    }
}
