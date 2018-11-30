package com.example.mgmcartofior.androiddeveloperfundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.alex.androidfundamentals.R;

public class WebViewActivity extends AppCompatActivity {
    private WebView mWebView;
    private static final String WEB_URL = "https://ro.wikipedia.org/wiki/Imperiul_Otoman";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initView();
    }

    private void initView() {
        mWebView = findViewById(R.id.webview_view);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl(WEB_URL);
        mWebView.setWebViewClient(new WebViewClient());
    }
}
