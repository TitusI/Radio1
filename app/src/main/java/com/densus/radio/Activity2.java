package com.densus.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.webkit.WebSettings;

public class Activity2 extends AppCompatActivity {

    private SlidrInterface slidr;
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        webView = (WebView) findViewById(R.id.WebView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://80.211.9.137:8000/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /* webView.loadUrl(); */


        slidr = Slidr.attach(this);
    }


        public void lockSlide(View v) {
        slidr.lock();
    }

    public void unlockSlide(View v) {

        slidr.unlock();
    }


}