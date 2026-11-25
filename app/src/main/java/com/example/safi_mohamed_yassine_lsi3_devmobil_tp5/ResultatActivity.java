package com.example.safi_mohamed_yassine_lsi3_devmobil_tp5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultatActivity extends AppCompatActivity {
    TextView txtResult, txtEtat;
    Button btnCall, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resultat);
        txtResult = findViewById(R.id.txtIMC);
        txtEtat = findViewById(R.id.txtEtat);
        btnCall = findViewById(R.id.btnCall);
        btnBack = findViewById(R.id.btnBack);

        String prenom = getIntent().getStringExtra("prenom");
        double imc = getIntent().getDoubleExtra("imc", 0);
        String sexe = getIntent().getStringExtra("sexe");   // ← récupération du sexe

        // Phrase selon le sexe
        String civilite;
        if (sexe != null && sexe.equals("Femme")) {
            civilite = "Madame";
        } else {
            civilite = "Monsieur";
        }
        txtResult.setText(civilite +"  "+prenom+  " votre IMC est : " + String.format("%.2f", imc));

        if (imc < 18.5)
            txtEtat.setText("maigreur");
        else if (imc < 25)
            txtEtat.setText("normal");
        else if (imc < 30)
            txtEtat.setText("surpoids");
        else
            txtEtat.setText("obésité");

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:123"));
                startActivity(call);
            }
        });

        btnBack.setOnClickListener(v -> finish());
    }
}

