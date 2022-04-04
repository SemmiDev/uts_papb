package dev.sammi.gomath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class DeveloperActivity extends AppCompatActivity {

    final String url = "https://sammidev.netlify.app";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView material = new WebView(getApplicationContext());
        setContentView(material);
        material.loadUrl(url);
    }
}
