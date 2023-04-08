package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class GirasolDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("GIRASOL")
                .setMessage("Helianthus annuus. Conocido comúnmente como girasol es una planta herbácea anual de la familia de las asteráceas originaria de Centro y Norteamérica y cultivada como alimenticia y ornamental en todo el mundo.")
                .setPositiveButton("OK", (dialogInterface, i) -> {

                });

        return builder.create();

    }
}
