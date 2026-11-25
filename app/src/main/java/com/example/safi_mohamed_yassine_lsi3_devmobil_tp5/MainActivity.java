package com.example.safi_mohamed_yassine_lsi3_devmobil_tp5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edtPrenom, edtPoids, edtTaille;
    private  Button btnCalculer;
    private RadioButton rbHomme, rbFemme;
    private TextView imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        edtPrenom=findViewById(R.id.etPrenom);
        edtPoids = findViewById(R.id.etPoids);
        edtTaille = findViewById(R.id.etTaille);
        btnCalculer = findViewById(R.id.btnCalculer);
        rbHomme = findViewById(R.id.rbHomme);
        rbFemme = findViewById(R.id.rbFemme);
        imc=findViewById(R.id.imc);



// Changer la couleur avec ContextCompat (remplace getResources().getColor)
        imc.setTextColor(ContextCompat.getColor(this, R.color.colorGreen));


        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String prenom = edtPrenom.getText().toString().trim();
                String poidsTexte = edtPoids.getText().toString().trim().replace(',', '.');
                String tailleTexte = edtTaille.getText().toString().trim().replace(',', '.');

                if (prenom.isEmpty() || poidsTexte.isEmpty() || tailleTexte.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Remplissez tous les champs",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    float poids = Float.parseFloat(poidsTexte);
                    float taille = Float.parseFloat(tailleTexte);

                    if (poids <= 0 || taille <= 0) {
                        Toast.makeText(MainActivity.this,
                                "Entrez des valeurs positives",
                                Toast.LENGTH_SHORT).show();
                        return;
                    }

                    float resultatImc = poids / (taille * taille);
                    String sexe = rbHomme.isChecked() ? "Homme" : "Femme";

                    Intent i = new Intent(MainActivity.this, ResultatActivity.class);
                    i.putExtra("prenom", prenom);
                    i.putExtra("imc", (double) resultatImc);
                    i.putExtra("sexe", sexe);
                    startActivity(i);

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this,
                            "Vérifiez le format du poids et de la taille",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

