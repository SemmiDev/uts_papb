package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button  btnBackMulaiBelajar,
            btnSegitigaSikuSiku,
            btnSegitigaSamaSisi,
            btnSegitigaSamaKaki,
            btnSegitigaSembarang,
            btnMaterial,
            btndeveloper;

    Intent toMaterial,
            toDeveloper,
            toHome,
            toSegitigaSikuSiku,
            toSegitigaSamaKaki,
            toSegitigaSembarang,
            toSegitigaSamaSisi;

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

        toMaterial = new Intent(getApplicationContext(), MaterialActivity.class);
        toDeveloper = new Intent(getApplicationContext(), DeveloperActivity.class);
        toHome = new Intent(getApplicationContext(), HomeActivity.class);
        toSegitigaSikuSiku = new Intent(getApplicationContext(), SegitigaSikuSikuActivity.class);
        toSegitigaSamaKaki = new Intent(getApplicationContext(), SegitigaSamaKakiActivity.class);
        toSegitigaSembarang = new Intent(getApplicationContext(), SegitigaSembarangActivity.class);
        toSegitigaSamaSisi = new Intent(getApplicationContext(), SegitigaSamaSisiActivity.class);

        launchActivity(btnMaterial, toMaterial);
        launchActivity(btndeveloper, toDeveloper);
        launchActivity(btnBackMulaiBelajar, toHome);
        launchActivity(btnSegitigaSikuSiku, toSegitigaSikuSiku);
        launchActivity(btnSegitigaSamaSisi, toSegitigaSamaSisi);
        launchActivity(btnSegitigaSamaKaki, toSegitigaSamaKaki);
        launchActivity(btnSegitigaSembarang, toSegitigaSembarang);
    }

    private void launchActivity(Button btn, final Intent intent) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
