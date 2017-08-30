package com.erroronserver.integrandoaplicativocomgit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button bottonNavigationAct = (Button) findViewById(R.id.bottonNavigationAct);
        Button itemDetailAct = (Button) findViewById(R.id.itemDetailAct);
        Button mainAct = (Button) findViewById(R.id.mainAct);
        Button navigationAct = (Button) findViewById(R.id.navigationAct);
        Button itemListAct = (Button) findViewById(R.id.itemListAct);
        Button scrollingAct = (Button) findViewById(R.id.scrollingAct);
        Button tabbedAct = (Button) findViewById(R.id.tabbedAct);


        bottonNavigationAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(BottomNavigationActivity.class);
            }
        });
        itemDetailAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(ItemDetailActivity.class);
            }
        });
        mainAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(MainActivity.class);
            }
        });
        navigationAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(NavigationActivity.class);
            }
        });
        itemListAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(ItemDetailActivity.class);
            }
        });
        scrollingAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(ScrollingActivity.class);
            }
        });
        tabbedAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaiPara(TabbedActivity.class);
            }
        });
    }

    private void vaiPara(Class aClass) {
        startActivity(new Intent(PrincipalActivity.this, aClass));
    }

}
