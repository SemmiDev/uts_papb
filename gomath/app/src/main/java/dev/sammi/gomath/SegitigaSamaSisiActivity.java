package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegitigaSamaSisiActivity extends AppCompatActivity {
    Button hitungLuasSegitigaSamaSisi;
    EditText sisi;
    TextView hasilLuas,hasilKeliling;
    Toast t;
    Double inputSisi;
    String sisiString;
    Double kalkulasiHasilLuas, kalkulasiHasilKel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sama_sisi);

        hitungLuasSegitigaSamaSisi = findViewById(R.id.btnHitungSegitigaSamaSisi);
        hitungLuasSegitigaSamaSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sisi = findViewById(R.id.sisiSegitigaSamaSisi);
                sisiString = sisi.getText().toString().trim();

                if (sisiString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Sisi Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    inputSisi = Double.valueOf(sisiString);

                    kalkulasiHasilLuas = luas(inputSisi);
                    kalkulasiHasilKel = keliling(inputSisi);

                    hasilLuas = findViewById(R.id.outputLuasSamaSisi);
                    hasilLuas.setText("");

                    hasilKeliling = findViewById(R.id.outputKelilingSamaSisi);
                    hasilKeliling.setText("");

                    hasilLuas.append(": " + kalkulasiHasilLuas);
                    hasilKeliling.append(": " + kalkulasiHasilKel);
                }
            }
        });
    }

    public double keliling(double sisi) {
        return 3 * sisi;
    }

    public double luas(double sisi) {
        double tinggi = (sisi * Math.sqrt(3)) / 2;
        return (sisi * tinggi) / 2;
    }
}
