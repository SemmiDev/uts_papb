package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button btnBackMulaiBelajar,
            btnSegitigaSikuSiku,
            btnSegitigaSamaSisi,
            btnSegitigaSamaKaki,
            btnSegitigaSembarang,
            btnMaterial,
            btndeveloper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        navigate();
    }

    private void navigate() {
        btnMaterial = findViewById(R.id.bacaMaterial);
        btndeveloper = findViewById(R.id.btnPengembang);
        btnBackMulaiBelajar = findViewById(R.id.btnBackMulaiBelajar);
        btnSegitigaSikuSiku = findViewById(R.id.btnSikuSiku);
        btnSegitigaSamaSisi = findViewById(R.id.btnSamaSisi);
        btnSegitigaSamaKaki = findViewById(R.id.btnSamaKaki);
        btnSegitigaSembarang = findViewById(R.id.btnSembarang);

        btnMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), MaterialActivity.class);
                startActivity(menu);
            }
        });

        btndeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), DeveloperActivity.class);
                startActivity(menu);
            }
        });

        btnBackMulaiBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(menu);
            }
        });

        btnSegitigaSikuSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), SegitigaSikuSikuActivity.class);
                startActivity(menu);
            }
        });

        btnSegitigaSamaSisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), SegitigaSamaSisiActivity.class);
                startActivity(menu);
            }
        });

        btnSegitigaSamaKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), SegitigaSamaKakiActivity.class);
                startActivity(menu);
            }
        });

        btnSegitigaSembarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), SegitigaSembarangActivity.class);
                startActivity(menu);
            }
        });
    }
}
