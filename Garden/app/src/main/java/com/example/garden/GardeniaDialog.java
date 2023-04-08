package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class GardeniaDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("GARDENIA")
                .setMessage("Gardenia jasminoides Ellis.\nSon arbustos de hojas perennes de color verde claro, brillantes y lisas.\nSus flores son blancas, similares a las rosas y se usan comúnmente como plantas ornamentales. Existen 259 especies descritas, y de estas solo 134 aceptadas.")
                .setPositiveButton("OK", (dialogInterface, i) -> {

                });

        return builder.create();

    }
}
