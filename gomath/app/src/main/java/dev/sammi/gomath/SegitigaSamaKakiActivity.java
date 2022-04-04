package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaSamaKakiActivity extends AppCompatActivity {

    Button hitungLuasSegitigaSamaKaki;
    EditText ab, ac;
    TextView hasilLuas,hasilKeliling;
    Toast t;
    Double inputAB, inputAC;
    String abString, acString;
    Double kalkulasiHasilLuas, kalkulasiHasilKel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sama_kaki);

        hitungLuasSegitigaSamaKaki = findViewById(R.id.btnHitungSegitigaSamaKaki);
        hitungLuasSegitigaSamaKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ab = findViewById(R.id.abSegitigaSamaKaki);
                ac = findViewById(R.id.acSegitigaSamaKaki);

                abString= ab.getText().toString().trim();
                acString= ac.getText().toString().trim();

                if (abString.matches("") && acString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang Sisi AB & Panjang Sisi AC harus diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else if (abString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang Sisi AB Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else if (acString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang Sisi AC Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    inputAB= Double.valueOf(abString);
                    inputAC= Double.valueOf(acString);

                    kalkulasiHasilLuas = luas(inputAB, inputAC);
                    kalkulasiHasilKel = keliling(inputAB, inputAC);

                    hasilLuas = findViewById(R.id.outputLuasSamaKaki);
                    hasilLuas.setText("");

                    hasilKeliling = findViewById(R.id.outputKelilingSamaKaki);
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

    public double keliling(double sisiAB, double sisiAC) {
        return sisiAB + sisiAC + sisiAC;
    }
}
