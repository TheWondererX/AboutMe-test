package valiakhmetov.lesson3.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    ImageView imageView;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AboutMe abm = new AboutMe();
        initViews();
        setButtonBehavior1();
        setButtonBehavior2();

    }

    private void initViews() {
        textView1 = (TextView)findViewById(R.id.text1);
        textView2 = (TextView)findViewById(R.id.text2);
        imageView = (ImageView)findViewById(R.id.image);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
    }

    private void setButtonBehavior1(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = textView1.getText().toString();
                textView1.setText(textView2.getText());
                textView2.setText(text);
            }
        });

    }

    private void setButtonBehavior2(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textView1.setTextColor(getResources().getColor(R.color.colorBlue));

            }
        });

    }
}// времени не было до делывать