package com.myemcu.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //AppLog
        toolbar.setLogo(R.mipmap.ic_launcher);
        // Title
        //toolbar.setTitle("My Title");
        // Sub Title
        //toolbar.setSubtitle("Sub title");

        //toolbar.setNavigationIcon(R.mipmap.ic_launcher);
    }
}
