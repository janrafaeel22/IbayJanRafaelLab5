package com.ibay.janrafael;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.btn2){
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:48.219557, 11.624407"));
            chooser = Intent.createChooser(i, "Choose!");
            startActivity(chooser);
        }
    }
}