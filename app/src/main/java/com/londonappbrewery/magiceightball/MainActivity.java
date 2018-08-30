package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button answerButton = findViewById(R.id.answer_button);
        final ImageView imageBall = findViewById(R.id.image_ball);

        final int [] ballArray =
                {R.drawable.ball1,
                 R.drawable.ball2,
                 R.drawable.ball3,
                 R.drawable.ball4,
                 R.drawable.ball5};

        answerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNew = new Random();
               int randomNum = randomNew.nextInt(4);

                imageBall.setImageResource(ballArray[randomNum]);

            }
        });

    }
}
