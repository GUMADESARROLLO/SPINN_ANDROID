package com.guma.desarrollo.webviewexplorer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mWebView.setWebViewClient(new MyAppWebClient());

        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.setWebViewClient(new WebViewClient());
        //mWebView.loadUrl("http://beta.html5test.com");
        if (savedInstanceState==null)
        {mWebView.loadUrl("http://www.laprensa.com.ni");}

    }
 
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        mWebView.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceSatate)
    {
        super.onRestoreInstanceState(savedInstanceSatate);
        mWebView.restoreState(savedInstanceSatate);
    }
}
