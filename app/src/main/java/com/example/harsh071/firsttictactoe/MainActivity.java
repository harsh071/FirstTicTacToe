package com.example.harsh071.firsttictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int activePlayer = 0 ; // 0 for o and 1 for x
    public void dropIn(View view){
        ImageView counter = (ImageView) view;

        counter.setTranslationY(-1500);
        if(activePlayer == 0 ){
            counter.setImageResource(R.drawable.o);
            activePlayer = 1;
        }else{
            counter.setImageResource(R.drawable.x);
            activePlayer = 0;
        }
        counter.animate().translationYBy(1500).rotation(3600).setDuration(300);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
