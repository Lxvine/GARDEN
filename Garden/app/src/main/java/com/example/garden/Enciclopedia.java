package com.example.garden;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Enciclopedia extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enciclopedia);

        Objects.requireNonNull(getSupportActionBar()).hide();

        ImageView ivgirasol = findViewById(R.id.ivgirasol);
        ImageView ivgardenia = findViewById(R.id.ivgardenia);
        ImageView ivrosa = findViewById(R.id.ivrosa);
        ImageView ivgeranio = findViewById(R.id.ivgeranio);
        ImageView ivtulipan = findViewById(R.id.ivtulipan);
        ImageView ivamapola = findViewById(R.id.ivamapola);
        ImageView ivdalia = findViewById(R.id.ivdalia);
        ImageView ivgladiolo = findViewById(R.id.ivgladiolo);
        ImageView ivorquidea = findViewById(R.id.ivorquidea);
        ImageView ivpetunia = findViewById(R.id.ivpetunia);
        ImageView ivclavel = findViewById(R.id.ivclavel);
        ImageView ivvioleta = findViewById(R.id.ivvioleta);


        Button backEnciclopedia = findViewById(R.id.backEnciclopedia);

        backEnciclopedia.setOnClickListener(view -> {
            Intent intent = new Intent(Enciclopedia.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

        ivgirasol.setOnClickListener(view -> dialogGirasol());

        ivgardenia.setOnClickListener(view -> dialogGardenia());

        ivrosa.setOnClickListener(view -> dialogRosa());

        ivgeranio.setOnClickListener(view -> dialogGeranio());

        ivtulipan.setOnClickListener(view -> dialogTulipan());

        ivamapola.setOnClickListener(view -> dialogAmapola());

        ivdalia.setOnClickListener(view -> dialogDalia());

        ivgladiolo.setOnClickListener(view -> dialogGladiolo());

        ivorquidea.setOnClickListener(view -> dialogOrquidea());

        ivpetunia.setOnClickListener(view -> dialogPetunia());

        ivclavel.setOnClickListener(view -> dialogClavel());

        ivvioleta.setOnClickListener(view -> dialogVioleta());

    }

    public void dialogGirasol() {
        GirasolDialog ed = new GirasolDialog();
        ed.show(getSupportFragmentManager(), "Dialogo Girasol");
    }

    public void dialogGardenia() {
        GardeniaDialog gad = new GardeniaDialog();
        gad.show(getSupportFragmentManager(), "Dialogo Gardenia");
    }

    public void dialogRosa() {
        RosaDialog rd = new RosaDialog();
        rd.show(getSupportFragmentManager(), "Dialogo Rosa");
    }

    public void dialogGeranio() {
        GeranioDialog ged = new GeranioDialog();
        ged.show(getSupportFragmentManager(), "Dialogo Geranio");
    }

    public void dialogTulipan() {
        TulipanDialog td = new TulipanDialog();
        td.show(getSupportFragmentManager(), "Dialogo Tulipan");
    }

    public void dialogAmapola() {
        AmapolaDialog ad = new AmapolaDialog();
        ad.show(getSupportFragmentManager(), "Dialogo Amapola");
    }

    public void dialogDalia() {
        DaliaDialog dd = new DaliaDialog();
        dd.show(getSupportFragmentManager(), "Dialogo Dalia");
    }

    public void dialogGladiolo() {
        GladioloDialog pd = new GladioloDialog();
        pd.show(getSupportFragmentManager(), "Dialogo Gladiolo");
    }

    public void dialogOrquidea() {
        OrquideaDialog od = new OrquideaDialog();
        od.show(getSupportFragmentManager(), "Dialogo Orquidea");
    }

    public void dialogPetunia() {
        PetuniaDialog pd = new PetuniaDialog();
        pd.show(getSupportFragmentManager(), "Dialogo Petunia");
    }

    public void dialogClavel() {
        ClavelDialog cd = new ClavelDialog();
        cd.show(getSupportFragmentManager(), "Dialogo Clavel");
    }

    public void dialogVioleta() {
        VioletaDialog vd = new VioletaDialog();
        vd.show(getSupportFragmentManager(), "Dialogo Violeta");
    }


}