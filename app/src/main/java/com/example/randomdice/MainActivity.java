package com.example.randomdice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_Click;
    ImageView img_Dice;
    Random random = new Random();
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_Dice = (ImageView) findViewById(R.id.img_Dice);
        btn_Click = (Button) findViewById(R.id.bnt_Click);

        btn_Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = random.nextInt(5);

                switch (index){
                    case 0:
                        img_Dice.setImageResource(R.drawable.dice1);
                        break;
                    case 1:
                        img_Dice.setImageResource(R.drawable.dice2);
                        break;
                    case 2:
                        img_Dice.setImageResource(R.drawable.dice3);
                        break;
                    case 3:
                        img_Dice.setImageResource(R.drawable.dice4);
                        break;
                    case 4:
                        img_Dice.setImageResource(R.drawable.dice6);
                        break;
                    case 5:
                        img_Dice.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });
    }
}