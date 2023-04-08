package com.example.garden;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class GeranioDialog extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("GERANIO")
                .setMessage("Geranium.\nComúnmente llamado Geranio agrupa 422 especies de plantas anuales," +
                        " bienales y perennes frecuentemente utilizadas en jardinería por sus atractivas flores " +
                        "y su aroma característico.")
                .setPositiveButton("OK", (dialogInterface, i) -> {

                });

        return builder.create();

    }
}
