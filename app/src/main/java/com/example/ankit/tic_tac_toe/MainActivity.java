package com.example.ankit.tic_tac_toe;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView t1, t2;
    int turn = 1;
    static int count = 0;
    int Xwon = 0;
    int  Owon = 0;
    private static final String KEY ="INDEX";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                        count++;
                        draw();

                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                        count++;
                        draw();
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        count++;
                        draw();
                    }
                }
                endGame();
                increment();

            }
        });

    }

    public void endGame() {
        String a, b, c, d, e, f, g, h, i;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();


        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();



        }
        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();



        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();



        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();



        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
             reset();



        }

        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();


        }

        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();


        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Xwon++;
            Toast.makeText(MainActivity.this, "PLAYER X WON", Toast.LENGTH_LONG).show();
            reset();


        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();



        }
        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();


        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();



        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();


        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();


        }

        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();


        }

        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();


        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Owon++;
            Toast.makeText(MainActivity.this, "PLAYER O WON", Toast.LENGTH_LONG).show();
            reset();


        }

    }

    public void draw() {
        if (count == 9) {
            Toast.makeText(MainActivity.this, "Match Draw", Toast.LENGTH_LONG).show();
            reset();
        }

    }
    public void reset(){
        b1.setText(null);
        b2.setText(null);
        b3.setText(null);
        b4.setText(null);
        b5.setText(null);
        b6.setText(null);
        b7.setText(null);
        b8.setText(null);
        b9.setText(null);
        count = 0;
    }
   public void increment(){
       String a = Integer.toString(Xwon);
       String b = Integer.toString(Owon);
       t1.setText(a);
       t2.setText(b);
   }
}