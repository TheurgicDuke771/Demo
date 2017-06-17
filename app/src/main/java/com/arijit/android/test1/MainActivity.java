package com.arijit.android.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        counter++;
        String msg;
        if (counter>1)
            msg = "Button clicked " + counter +" times";
        else
            msg = "Button clicked " + counter +" time";
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(msg);
    }
}
