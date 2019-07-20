package com.densus.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;



import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {

    private SlidrInterface slidr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

         WebView webView;

            webView = (WebView) findViewById(R.id.WebView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("http://www.google.com");


        slidr = Slidr.attach(this);
    }


        public void lockSlide(View v) {
        slidr.lock();
    }

    public void unlockSlide(View v) {

        slidr.unlock();
    }


}