package com.example.garden;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Button enciclopedia = findViewById(R.id.enciclopedia);
        Button jardin = findViewById(R.id.jardin);
        Button salir = findViewById(R.id.salir);

        enciclopedia.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Enciclopedia.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

        jardin.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MiJardin.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

        salir.setOnClickListener(view -> finish());

    }
}
