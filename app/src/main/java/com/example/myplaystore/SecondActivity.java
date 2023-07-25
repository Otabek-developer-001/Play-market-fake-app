package com.example.myplaystore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myplaystore.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        Intent intent1 = getIntent();
        String name = intent1.getExtras().getString("name");
        String amount = intent1.getExtras().getString("amount");
        int image = intent1.getExtras().getInt("image");

        binding.name.setText(name);
        binding.amount.setText(amount);
        binding.image.setImageResource(image);

        binding.arrowTV.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            startActivity(intent);

        });
        binding.btnInstall.setOnClickListener(v -> {
            Toast.makeText(this, "Tugadi😂", Toast.LENGTH_SHORT).show();
        });
    }
}