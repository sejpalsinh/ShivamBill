package com.i2i.shivambill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Cnc_Bill extends AppCompatActivity {

    WebView myweb_wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnc__bill);
        
        //Webview Settings and set up
        myweb_wb = findViewById(R.id.web_view);
        WebSettings webSettings = myweb_wb.getSettings();
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);


        //Load html file in WebView
        myweb_wb.loadUrl("file:///android_asset/cncbill.html");
    }

    // On click or print for webview
    public void doit(View view) {
        createWebPrintJob(myweb_wb);
    }

    // Call function for print web View
    private void createWebPrintJob(WebView webView) {
        PrintManager printManager = (PrintManager) this.getSystemService(Context.PRINT_SERVICE);
        PrintDocumentAdapter printAdapter = webView.createPrintDocumentAdapter();
        String jobName = getString(R.string.app_name) + " Print Test";
        if (printManager != null)
        {
            printManager.print(jobName, printAdapter, new PrintAttributes.Builder().build());
        }
    }

}
