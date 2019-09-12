package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Example");
        Switch switch2 =  findViewById(R.id.switch2);
        if (switch2 != null) {
            switch2.setOnCheckedChangeListener(this);
        }
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Toast.makeText(this, "Отслеживание переключения: " + (isChecked ? "on" : "off"),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void PuttedClick(View view) {
        Toast toast = Toast.makeText(this, "Putted", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void NotPuttedClick(View view) {
        Toast toast = Toast.makeText(this, "Putted", Toast.LENGTH_SHORT);
        toast.show();
    }

}
