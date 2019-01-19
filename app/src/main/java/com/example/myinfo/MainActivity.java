package com.example.myinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button pictBttn;
    ImageView pictView;
    TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pictBttn = (Button) findViewById(R.id.PictureButton);
        pictView = (ImageView) findViewById(R.id.MyImageView);
        textInfo = (TextView) findViewById(R.id.textView);
        pictBttn.setOnClickListener(new ClickButton());
    }

    private class ClickButton implements  Button.OnClickListener{
        public void onClick (View v){
            pictView.setImageResource((R.drawable.nsu));
            String info = getString(R.string.myInfo);
            textInfo.setText(info);
            pictView.setVisibility(View.VISIBLE);
        }
    }


}
