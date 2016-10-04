package com.guma.desarrollo.webviewexplorer;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by analista3.unimarksa on 04/10/2016.
 */

public class MyAppWebClient extends WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        if (Uri.parse(url).getHost().endsWith("html5rocks.com"))
        {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
