package com.example.k8048.adnroidexercise1secondlecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int SHOW_NEW_ACTIVITY = 1;

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

    public void resultButtonAction(View anotherView){
        Intent intent = new Intent(this, activityNo2.class);
        startActivityForResult(intent, SHOW_NEW_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == SHOW_NEW_ACTIVITY && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            //String text = extras.get("text").toString();
            //TextView textResult = (TextView) findViewById(R.id.resultText);
            //textResult.setText(text);
        }
    }
}
