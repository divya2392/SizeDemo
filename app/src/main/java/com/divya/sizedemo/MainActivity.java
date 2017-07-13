package com.divya.sizedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView title_text, normal_text;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_text = (TextView)findViewById(R.id.title_text);
        normal_text = (TextView)findViewById(R.id.text_id);
        button = (Button)findViewById(R.id.button);
    }
}
