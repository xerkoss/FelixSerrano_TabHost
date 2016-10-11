package com.felixserrano.tabhost;

import android.app.TabActivity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("pest1");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("pest2");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("pest3");

        tab1.setIndicator(res.getString(R.string.eti_tab1), null);
        tab2.setIndicator(res.getString(R.string.eti_tab2), null);
        tab3.setIndicator(res.getString(R.string.eti_tab3), null);

        tab1.setContent(R.id.tab1Layout);
        tab2.setContent(R.id.tab2Layout);
        tab3.setContent(R.id.tab3Layout);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

    }
}
