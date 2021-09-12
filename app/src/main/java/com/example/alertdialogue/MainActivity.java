package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow=findViewById(R.id.btnShow);
        AlertDialog alertDialog=new AlertDialog.Builder(MainActivity.this)
                .setTitle("Deletion")
                .setMessage("Do you want to Delete this file?")
                .setIcon(R.drawable.ic_baseline_add_alert_24)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Deleted Successfully", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Not Deleted", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Help", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "By Pressing Yes,file will be deleted", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.show();

            }
        });
    }
}
//TODO:1.Create Projrct,Design xml
//TODO:2.Define class of button,make refrence variable                                                                                Line No 13
//TODO:3.find view by id and make a click listener of it                                                                              Line No 20
//TODO:4.Make a class of Alert Dialogue and initialize it wth Builder and then set attributes like .setMessage etc                    Line No 21
//TODO:5.last attribute must be .create()                                                                                             Line No 43
//TODO:6.Then in click Listener of Button pass the refrence variable of Alert Dialogue and show it                                    Line No 47