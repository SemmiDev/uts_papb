package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MaterialActivity extends AppCompatActivity {

    final String url = "https://rumuspintar.com/segitiga/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView material = new WebView(getApplicationContext());
        setContentView(material);
        material.loadUrl(url);
    }
}
