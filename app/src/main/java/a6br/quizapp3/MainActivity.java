package a6br.quizapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button beins;
    private Button bzwei;
    private Button bdrei;
    private Button bvier;
    private Button bfünf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.beins = (Button) this.findViewById(R.id.beins);
        this.bzwei = (Button) this.findViewById(R.id.bzwei);
        this.bdrei = (Button) this.findViewById(R.id.bdrei);
        this.bvier = (Button) this.findViewById(R.id.bvier);
        this.bfünf = (Button) this.findViewById(R.id.bfünf);

        this.beins.setOnClickListener(this);
        this.bzwei.setOnClickListener(this);
        this.bdrei.setOnClickListener(this);
        this.bvier.setOnClickListener(this);
        this.bfünf.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}