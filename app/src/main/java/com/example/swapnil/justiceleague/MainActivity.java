package com.example.swapnil.justiceleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int x=1;

    public void fade(View view){

        ImageView imageView=(ImageView)findViewById(R.id.superman);
        ImageView imageView1=(ImageView)findViewById(R.id.batman);
        ImageView imageView2=(ImageView)findViewById(R.id.wonderWoman);

        if (x==1){
            x=2;
            imageView.animate().alpha(1).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
        }else if (x==2){
            x=3;
            imageView.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
        }else {
            x=1;
            imageView.animate().alpha(0).setDuration(2000);
            imageView1.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
        }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
