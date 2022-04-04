package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import dev.sammi.gomath.R;

public class SegitigaSikuSikuActivity extends AppCompatActivity {
    Button hitungLuasSegitigaSikuSiku;
    EditText alas, tinggi;
    TextView hasilLuas,hasilKeliling;
    Toast t;
    Double inputAlas, inputTinggi;
    String alasString, tinggiString;
    Double kalkulasiHasilLuas, kalkulasiHasilKel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_siku_siku);

        hitungLuasSegitigaSikuSiku = findViewById(R.id.btnHitungSegitigaSikuSiku);
        hitungLuasSegitigaSikuSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alas = findViewById(R.id.alasSegitigaSikuSiku);
                tinggi = findViewById(R.id.tinggiSegitigaSikuSiku);

                alasString = alas.getText().toString().trim();
                tinggiString = tinggi.getText().toString().trim();

                if (alasString .matches("") && tinggiString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Alas & Tinggi Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else if (alasString .matches("")) {
                    Toast.makeText(getApplicationContext(), "Alas Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else if (tinggiString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Tinggi Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    inputAlas = Double.valueOf(alasString);
                    inputTinggi = Double.valueOf(tinggiString);

                    kalkulasiHasilLuas = luas(inputAlas, inputTinggi);
                    kalkulasiHasilKel = keliling(inputAlas, inputTinggi);

                    hasilLuas = findViewById(R.id.outputLuasSikuSiku);
                    hasilLuas.setText("");

                    hasilKeliling = findViewById(R.id.outputKelilingSikuSiku);
                    hasilKeliling.setText("");

                    hasilLuas.append(": " + kalkulasiHasilLuas);
                    hasilKeliling.append(": " + kalkulasiHasilKel);
                }
            }
        });
    }

    public double luas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    public double keliling(double alas, double tinggi) {
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + miring;
    }
}
