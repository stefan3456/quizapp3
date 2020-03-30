package a6br.quizapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bOne = findViewById(R.id.bOne);
        Button bTwo = findViewById(R.id.bTwo);
        Button bThree = findViewById(R.id.bThree);
        Button bFour = findViewById(R.id.bFour);

        bOne.setOnClickListener(this);
        bTwo.setOnClickListener(this);
        bThree.setOnClickListener(this);
        bFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}

