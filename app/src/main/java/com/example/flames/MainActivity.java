package com.example.flames;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.*;

public class MainActivity extends AppCompatActivity {
    private Button bt1;
    private TextView tv1;
    private EditText et1;
    private EditText et2;
    private String m,f;
    private int index=0,tc,sc,i,j;
    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1=(TextView) findViewById(R.id.tv1);
        iv1=(ImageView) findViewById(R.id.iv1);
        iv1.setVisibility(View.GONE);
        tv1.setVisibility(View.GONE);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m=et1.getText().toString().toLowerCase();
                f=et2.getText().toString().toLowerCase();


                //str to char array and remove duplicates
                for (int i = 0; i < m.length(); i++) {
                    for (int j = 0; j < f.length(); j++) {
                        if (m.charAt(i) == f.charAt(j)) {
                            m = m.replaceFirst(String.valueOf(m.charAt(i)), "#");
                            f = f.replaceFirst(String.valueOf(f.charAt(j)), "#");
                        }
                    }
                }

                String mf=m.concat(f);
                mf = mf.replaceAll("#", "");
                tc=mf.length();


                //finding flames


                if(tc ==1)
                {
                    iv1.setImageResource(R.drawable.bands);
                    tv1.setText("SISTERS/BROTHERS");
                    iv1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                }
                else if(tc==2|| tc==4|| tc==7|| tc==9|| tc==20|| tc==22|| tc==24)
                {
                    iv1.setImageResource(R.drawable.enemy);
                    tv1.setText("ENEMY");
                    iv1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                }
                else if(tc==3|| tc==5|| tc==14|| tc==16|| tc==18|| tc==21|| tc==23)
                {
                    iv1.setImageResource(R.drawable.f);
                    tv1.setText("FRIENDS");
                    iv1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                }
                else if(tc==6|| tc==11|| tc==15)
                {
                    iv1.setImageResource(R.drawable.m1);
                    tv1.setText("MARRAIGE");
                    iv1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                }
                else if(tc==8|| tc==12|| tc==13|| tc==17)
                {
                    iv1.setImageResource(R.drawable.att);
                    tv1.setText("ATTRACTION");
                    iv1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                }
                else if(tc==10|| tc==19)
                {
                    iv1.setImageResource(R.drawable.love);
                    tv1.setText("LOVE");
                    iv1.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.VISIBLE);
                }

            }
        });
    }
}