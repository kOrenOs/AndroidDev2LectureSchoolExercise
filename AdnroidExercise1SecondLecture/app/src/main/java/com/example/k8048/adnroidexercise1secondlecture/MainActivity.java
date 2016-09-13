package com.example.k8048.adnroidexercise1secondlecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAction(View anotherView){
        EditText edT = (EditText) findViewById(R.id.editText);
        String line = edT.getText().toString();

        Intent intent = new Intent(this, activityNo2.class);
        intent.putExtra("Text", line);
        startActivity(intent);
    }
}
