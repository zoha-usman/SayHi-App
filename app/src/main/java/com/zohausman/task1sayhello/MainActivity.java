package com.zohausman.task1sayhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView Hello = findViewById(R.id.Hello);
        EditText editText = findViewById(R.id.EditText);
        Hello.setText("Hi " + editText.getText().toString());
    }
}