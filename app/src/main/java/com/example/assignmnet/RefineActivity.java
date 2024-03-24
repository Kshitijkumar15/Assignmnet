package com.example.assignmnet;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RefineActivity extends AppCompatActivity {
    Spinner sp;
    SeekBar seekBar;
    Toolbar toolbar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_refine);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        toolbar2 = findViewById(R.id.toolbar2);
//        setSupportActionBar(toolbar2);
        sp=findViewById(R.id.spinner);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(this,R.array.options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        sp.setAdapter(adapter);
        seekBar = findViewById(R.id.seekBar);
        int max = seekBar.getMax();
        seekBar.setProgress(max / 2);
    }
}