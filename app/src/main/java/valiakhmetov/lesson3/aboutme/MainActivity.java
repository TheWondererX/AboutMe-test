package valiakhmetov.lesson3.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         AboutMe abm = new AboutMe();
    }

    private void initViews() {
        textView1 = (TextView)findViewById(R.id.text1);
       // textView2 = (TextView)findViewById(R.id.text2);
        imageView = (ImageView)findViewById(R.id.image);
        button = (Button)findViewById(R.id.button);
    }

}
