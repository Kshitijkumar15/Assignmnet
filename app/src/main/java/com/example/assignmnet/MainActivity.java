package com.example.assignmnet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar progressBar,progressBar2;
    TabLayout tb;
    ViewPager vp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tb=findViewById(R.id.tab);
        vp=findViewById(R.id.viewpager);
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);
        tb.setupWithViewPager(vp);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = findViewById(R.id.progressBar2);
        progressBar2 = findViewById(R.id.progressBar1);
        int maxProgress = progressBar.getMax();
        int halfProgress = maxProgress / 2;
        progressBar.setProgress(halfProgress);
        progressBar2.setProgress(halfProgress);



    }
        public boolean onCreateOptionsMenu(Menu menu){
            MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.toolbarmenu,menu);
            return true;

        }
        public boolean onOptionsItemSelected(MenuItem item){
            if (item.getItemId() == R.id.refineFragment) {
                Intent intent = new Intent(this, RefineActivity.class);
                startActivity(intent);
                return true;
            } else
                return super.onOptionsItemSelected(item);
        }

    }
