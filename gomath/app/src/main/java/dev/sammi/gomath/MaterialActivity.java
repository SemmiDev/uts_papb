package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MaterialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView material = new WebView(getApplicationContext());
        setContentView(material);
        material.loadUrl("https://rumuspintar.com/segitiga/");
    }
}