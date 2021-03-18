package com.example.toastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    //Toast mToastToShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(60000, 1000) {
                    public void onTick(long millisUntilFinished) {
                        button.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }
                    //Toast toast = new Toast.makeText(MainActivity.this, "Time Over", Toast.LENGTH_LONG).show();
                    public void onFinish() {
                        Toast.makeText(MainActivity.this, "Ping! 1 minute over", Toast.LENGTH_LONG).show();
                        button.setText("CLICK ME!");

                    }
                }.start();

            }
        });
    }


}