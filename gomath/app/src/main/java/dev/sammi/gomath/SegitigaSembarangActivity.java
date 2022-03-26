package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import dev.sammi.gomath.R;

public class SegitigaSembarangActivity extends AppCompatActivity {

    Button hitungLuasSegitigaSembarang;
    EditText ab, ac, bc;
    TextView hasilLuas,hasilKeliling;
    Toast t;
    Double inputAB, inputAC, inputBC;
    String abString, acString, bcString;
    Double kalkulasiHasilLuas, kalkulasiHasilKel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sembarang);

        hitungLuasSegitigaSembarang = findViewById(R.id.btnHitungSegitigaSembarang);
        hitungLuasSegitigaSembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ab = findViewById(R.id.sisiABSembarang);
                bc = findViewById(R.id.sisiBCSembarang);
                ac = findViewById(R.id.sisiACSembarang);

                abString = ab.getText().toString().trim();
                bcString = bc.getText().toString().trim();
                acString = ac.getText().toString().trim();

                if (acString.matches("") && bcString.matches("") && acString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang sisi AB, BC & AC Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else if (abString.matches("") && bcString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang sisi AB & BC Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                } else if (acString.matches("") && bcString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang sisi AC & BC Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                }else if(abString.matches("") && abString.matches("")) {
                    Toast.makeText(getApplicationContext(), "Panjang sisi AB & AC Harus Diisi", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    inputAB = Double.valueOf(abString);
                    inputBC = Double.valueOf(bcString);
                    inputAC = Double.valueOf(acString);

                    kalkulasiHasilLuas = luas(inputAB, inputBC, inputAC);
                    kalkulasiHasilKel = keliling(inputAB, inputBC, inputAC);

                    hasilLuas = findViewById(R.id.outputLuasSembarang);
                    hasilLuas.setText("");

                    hasilKeliling = findViewById(R.id.outputKelilingSembarang);
                    hasilKeliling.setText("");

                    hasilLuas.append(": " + kalkulasiHasilLuas);
                    hasilKeliling.append(": " + kalkulasiHasilKel);
                }
            }
        });
    }

    public double keliling(double sisiA, double sisiB, double sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double luas(double sisiA, double sisiB, double sisiC) {
        double s = keliling(sisiA, sisiB, sisiC) / 2;
        return Math.sqrt(s * ((s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}