package com.example.vidhathri.xyz;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.vidhathri.xyz.player_name.PREFS_NAME;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, refsh, ex;
    int r1 = 0, r2 = 0, r3 = 0, c1 = 0, c2 = 0, c3 = 0, d1 = 0, d2 = 0;
    int r11 = 0, r12 = 0, r13 = 0, r21 = 0, r22 = 0, r23 = 0, r31 = 0, r32 = 0, r33 = 0;
    int flag1 = 0,f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0, f6 = 0, f7 = 0, f8 = 0, f9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        refsh = findViewById(R.id.refresh);
        ex = findViewById(R.id.exit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f1!=1) {

                    if (flag1 == 0) {
                        flag1 = 1;
                        // b1.setText("X");
                        b1.setBackgroundResource(R.drawable.x);
                        r11 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        // b1.setText("O");
                        b1.setBackgroundResource(R.drawable.o);
                        r11 += 10;
                    }
                    f1=1;
                    result();
                    //b1.setEnabled(false);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f2!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b2.setText("X");
                        b2.setBackgroundResource(R.drawable.x);
                        r12 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        //b2.setText("O");
                        b2.setBackgroundResource(R.drawable.o);
                        r12 += 10;
                    }
                    f2 = 1;
                    result();
                    //b2.setEnabled(false);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f3!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b3.setText("X");
                        b3.setBackgroundResource(R.drawable.x);
                        r13 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        //b3.setText("O");
                        b3.setBackgroundResource(R.drawable.o);
                        r13 += 10;
                    }
                    f3=1;
                    result();
                    //b3.setEnabled(false);
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f4!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b4.setText("X");
                        b4.setBackgroundResource(R.drawable.x);r21 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        //b4.setText("O");
                        b4.setBackgroundResource(R.drawable.o);
                        r21 += 10;
                    }
                    f4=1;
                    result();
                    //b4.setEnabled(false);
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f5!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b5.setText("X");
                        b5.setBackgroundResource(R.drawable.x);
                        r22 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        //b5.setText("O");
                        b5.setBackgroundResource(R.drawable.o);
                        r22 += 10;
                    }
                    f5=1;
                    result();
                    //b5.setEnabled(false);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f6!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b6.setText("X");
                        b6.setBackgroundResource(R.drawable.x);
                        r23 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        //b6.setText("O");
                        b6.setBackgroundResource(R.drawable.o);
                        r23 += 10;
                    }
                    f6 = 1;
                    result();
                    //b6.setEnabled(false);
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f7!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b7.setText("X");
                        b7.setBackgroundResource(R.drawable.x);
                        r31 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        // b7.setText("O");
                        b7.setBackgroundResource(R.drawable.o);
                        r31 += 10;
                    }
                    f7 = 1;
                    result();
                    //b7.setEnabled(false);
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f8!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        // b8.setText("X");
                        b8.setBackgroundResource(R.drawable.x);
                        r32 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        //b8.setText("O");
                        b8.setBackgroundResource(R.drawable.o);
                        r32 += 10;
                    }
                    f8 = 1;
                    result();
                    //b8.setEnabled(false);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f9!=1) {
                    if (flag1 == 0) {
                        flag1 = 1;
                        //b9.setText("X");
                        b9.setBackgroundResource(R.drawable.x);
                        r33 += 1;
                    } else if (flag1 == 1) {
                        flag1 = 0;
                        // b9.setText("O");
                        b9.setBackgroundResource(R.drawable.o);
                        r33 += 10;
                    }
                    f9 = 1;
                    result();
                    //b9.setEnabled(false);
                }
            }
        });
        refsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });

        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish();
                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
            }
        });

    }


    public void result()
    {
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String p1= prefs.getString("player1", null);
        String p2= prefs.getString("player2", null);
        r1=r11+r12+r13;
        r2=r21+r22+r23;
        r3=r31+r32+r33;
        c1=r11+r21+r31;
        c2=r12+r22+r32;
        c3=r13+r23+r33;
        d1=r11+r22+r33;
        d2=r13+r22+r31;
        if(r1==3 || r2==3 || r3==3 || c1==3 || c2==3 || c3==3 || d1==3 || d2==3 )
        {
            Toast.makeText(getApplicationContext(),
                    p1+" Won!!",
                    Toast.LENGTH_LONG).show();
            f1=1;
            f2=1;
            f3=1;
            f4=1;
            f5=1;
            f6=1;
            f7=1;
            f8=1;
            f9=1;
        }
        else if(r1==30|| r2==30 || r3==30 || c1==30 || c2==30 || c3==30 || d1==30 || d2==30)
        {
            Toast.makeText(getApplicationContext(),
                    p2+" Won!!",
                    Toast.LENGTH_LONG).show();
            f1=1;
            f2=1;
            f3=1;
            f4=1;
            f5=1;
            f6=1;
            f7=1;
            f8=1;
            f9=1;
        }
        else if(f1==1 && f2==1 && f3==1 && f4==1 && f5==1 && f6==1 && f7==1 && f8==1 && f9==1)
        {
            Toast.makeText(getApplicationContext(), "Match draw", Toast.LENGTH_LONG).show();
        }
    }
    public void refresh()
    {
        flag1=0;
//        b1.setText("");
//        b2.setText("");
//        b3.setText("");
//        b4.setText("");
//        b5.setText("");
//        b6.setText("");
//        b7.setText("");
//        b8.setText("");
//        b9.setText("");

        b1.setBackgroundResource(R.drawable.grid);
        b2.setBackgroundResource(R.drawable.grid);
        b3.setBackgroundResource(R.drawable.grid);
        b4.setBackgroundResource(R.drawable.grid);
        b5.setBackgroundResource(R.drawable.grid);
        b6.setBackgroundResource(R.drawable.grid);
        b7.setBackgroundResource(R.drawable.grid);
        b8.setBackgroundResource(R.drawable.grid);
        b9.setBackgroundResource(R.drawable.grid);



        //Intent i=new Intent(this, MainActivity.class);
        //startActivity(i);

        f1=0;
        f2=0;
        f3=0;
        f4=0;
        f5=0;
        f6=0;
        f7=0;
        f8=0;
        f9=0;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        d1 = 0;
        d2 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r31 = 0;
        r32 = 0;
        r33 = 0;

    }
}