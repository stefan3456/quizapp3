package a6br.quizapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bone = (Button) this.findViewById(R.id.bone);
        this.bone.setOnClickListener(this);}

    //Intent intent = new Intent(this, AnotherActivity.class);
    //startActivity(intent);


    @Override
    public void onClick(View view) {


    }
}


