package ru.startandroid.colormatching;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button[] buttons = {
                (Button) findViewById(R.id.button),
                (Button) findViewById(R.id.button2),
                (Button) findViewById(R.id.button3),
                (Button) findViewById(R.id.button4),
                (Button) findViewById(R.id.button5),
                (Button) findViewById(R.id.button6),
                (Button) findViewById(R.id.button7),
                (Button) findViewById(R.id.button8),
                (Button) findViewById(R.id.button9),
                (Button) findViewById(R.id.button10),
                (Button) findViewById(R.id.button11),
                (Button) findViewById(R.id.button12),
        };

        final ColorGenerator colorGenerator = new ColorGenerator();

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setBackgroundColor(colorGenerator.getRandomColor());
            }
        };

        for(Button b : buttons) {
            b.setOnClickListener(onClickListener);
        }
    }
}

class ColorGenerator {
    private final int[] colors = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.YELLOW, Color.WHITE, Color.CYAN};
    Random random;

    ColorGenerator() {
        random = new Random();
    }

    public int getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
