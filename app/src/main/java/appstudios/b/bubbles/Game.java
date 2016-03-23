package appstudios.b.bubbles;


import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Game extends Activity {

    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28;
    static int Time,score;
    static CountDownTimer cdt1,cdt2;
    static boolean o1,o2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.button);
        b9 = (Button) findViewById(R.id.button2);
        b10 = (Button) findViewById(R.id.button3);
        b11 = (Button) findViewById(R.id.button4);
        b12 = (Button) findViewById(R.id.button5);
        b13 = (Button) findViewById(R.id.button6);
        b14 = (Button) findViewById(R.id.button7);
        b15 = (Button) findViewById(R.id.button8);
        b16 = (Button) findViewById(R.id.button9);
        b17 = (Button) findViewById(R.id.button10);
        b18 = (Button) findViewById(R.id.button11);
        b19 = (Button) findViewById(R.id.button12);
        b20 = (Button) findViewById(R.id.button13);
        b21 = (Button) findViewById(R.id.button14);
        b22 = (Button) findViewById(R.id.button15);
        b23 = (Button) findViewById(R.id.button16);
        b24 = (Button) findViewById(R.id.button17);
        b25 = (Button) findViewById(R.id.button18);
        b26 = (Button) findViewById(R.id.button19);
        b27 = (Button) findViewById(R.id.button20);
        b28 = (Button) findViewById(R.id.button21);

        o1 = false;
        b1.setClickable(false);
        chooser();

        Time = 5000;

        cdt1 = new CountDownTimer(Time, 500) {

            @Override
            public void onTick(long millisUntilFinished) {
                b1.setClickable(true);
                b1.setBackgroundColor(0xff2200);
                b1.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                if (o1 == true) {
                    score++;
                    chooser();
                }
            }
        };

            b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o1 = true;
            }
        });

        cdt2 = new CountDownTimer(Time, 500) {

            @Override
            public void onTick(long millisUntilFinished) {
                b2.setClickable(true);
                b2.setBackgroundColor(0xff2200);
                b2.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {
                if (o2 == true) {
                    score++;

                    chooser();
                }
            }
        };

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o2 = true;
            }
        });






    }

    /**public static void b1choose (String sd) {

        b1.setBackgroundColor(0xff2200);
        b1.setText("" + );


    }**/

    public static void chooser () {
        int z = (int) (Math.random() * 28+1);

        if (z == 1) {
            cdt1.start();
        }

        if (z == 2) {
            cdt2.start();
        }
        else{
            chooser();
        }
    }
}

