package com.example.sanyam.beacons;

import android.content.Context;
import android.webkit.WebView;

/**
 * Created by sanyam on 29/12/16.
 */


public class GifWebView extends WebView {

    public GifWebView(Context context, String path) {
        super(context);

        loadUrl(path);
    }
}
