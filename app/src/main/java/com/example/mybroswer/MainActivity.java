package com.example.mybroswer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText urlET;
    private ImageView insta,fs,whatsapp,github,twitter,youtube;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlET=findViewById(R.id.serch);
        insta=findViewById(R.id.instagram);
        fs=findViewById(R.id.facebook);
        whatsapp=findViewById(R.id.whatsapp);
        github=findViewById(R.id.github);
        twitter=findViewById(R.id.twitter);
        youtube=findViewById(R.id.youtube);

        urlET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH){
                    final String urlTxt=urlET.getText().toString();
                    if (!urlTxt.isEmpty()){
                        urlET.setText("");
                        Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                        intent.putExtra("url",urlTxt);
                        startActivity(intent);
                    }
                }
                return false;
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                intent.putExtra("url","www.instagram.com");
                startActivity(intent);

            }
        });

        fs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                intent.putExtra("url","www.facebook.com");
                startActivity(intent);


            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                intent.putExtra("url","www.linkedin.com/");
                startActivity(intent);

            }
        });


        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                intent.putExtra("url","github.com/login");
                startActivity(intent);


            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                intent.putExtra("url","twitter.com/i/flow/login");
                startActivity(intent);


            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OpenBrower.class);
                intent.putExtra("url","www.youtube.com/");
                startActivity(intent);


            }
        });





    }
}