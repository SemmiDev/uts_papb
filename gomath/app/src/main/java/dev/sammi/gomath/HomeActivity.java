package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button mulaiBelajar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mulaiBelajar = findViewById(R.id.mulaiBelajar);
        mulaiBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(menu);
            }
        });
    }
}
