package com.example.vidhathri.xyz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by vidhathri on 11/11/2017.
 */

public class player_name extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";
    Button ok,exit;
    EditText p1,p2;
    int flag=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_name_ip);

        ok=(Button)findViewById(R.id.ok);
        exit=(Button)findViewById(R.id.exit);
        p1=(EditText)findViewById(R.id.p1);
        p2=(EditText)findViewById(R.id.p2);
        p1.requestFocus();


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p1.getText().equals("") || p2.getText().equals(""))
                {
                    Toast.makeText(player_name.this, "Please Enter The player Names", Toast.LENGTH_LONG);
                }
                else {
                    flag=1;
                    String player1=p1.getText().toString();
                    String player2=p2.getText().toString();

                    SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("player1", player1);
                    editor.putString("player2", player2);
                    editor.apply();

                    p1.setText("  ");
                    p2.setText("  ");
                    p1.requestFocus();

                    Intent i=new Intent(player_name.this, MainActivity.class);
                    startActivity(i);
                }

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
            }
        });

    }

}