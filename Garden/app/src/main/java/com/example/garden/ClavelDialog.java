package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ClavelDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("CLAVEL")
                .setMessage("Dianthus caryophyllus.\nEs una planta herbácea perteneciente a la familia de las Caryophyllaceae, es considerada como flor del agua, difundida en las regiones mediterráneas..")
                .setPositiveButton("OK", (dialogInterface, i) -> {

                });

        return builder.create();

    }
}
