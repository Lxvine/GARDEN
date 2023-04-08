package com.example.garden;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

public class MiJardin extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_jardin);

        Objects.requireNonNull(getSupportActionBar()).hide();

        ListView lv = findViewById(R.id.itemlist);
        Button backJardin = findViewById(R.id.backJardin);
        Button addJardin = findViewById(R.id.addJardin);

        arrayList = new ArrayList<>();

        arrayList.add("Petunia");
        arrayList.add("Rosal");
        arrayList.add("Nardo");
        arrayList.add("Hiedra");
        arrayList.add("Violeta");
        arrayList.add("Lavándula");
        arrayList.add("Orquídea");
        arrayList.add("Geranio");
        arrayList.add("Gladiolo");
        arrayList.add("Gardenia");

        adapter = new ArrayAdapter<>(MiJardin.this, android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);

        lv.setOnItemLongClickListener((adapterView, view, position, id) -> {

            final int which_item = position;

            new AlertDialog.Builder(MiJardin.this)
                    .setIcon(android.R.drawable.ic_delete)
                    .setTitle("¿Estás seguro?")
                    .setMessage("¿Quieres eliminar esta planta?")
                    .setPositiveButton("Sí", (dialogInterface, which) -> {
                        arrayList.remove(which_item);
                        adapter.notifyDataSetChanged();
                    })
                    .setNegativeButton("No", null)
                    .show();
            return true;
        });

        backJardin.setOnClickListener(view -> {
            Intent intent = new Intent(MiJardin.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

        addJardin.setOnClickListener(view -> {

            AlertDialog.Builder dialog = new AlertDialog.Builder((MiJardin.this));
            dialog.setTitle("Introduzca el nombre de la planta a añadir: ");


            final EditText et = new EditText(MiJardin.this);
            et.setInputType(InputType.TYPE_CLASS_TEXT);
            dialog.setView(et);

            dialog.setPositiveButton("OK", (dialogInterface, i) -> {
                if (!et.getText().toString().equals("")) {
                    arrayList.add(et.getText().toString());

                    Toast.makeText(MiJardin.this, "La planta añadida es: " + et.getText().toString(), Toast.LENGTH_LONG).show();
                }
            });

            dialog.setNegativeButton("CANCEL", (dialogInterface, i) -> dialogInterface.cancel());

            dialog.show();

            adapter.notifyDataSetChanged();

        });

    }
}