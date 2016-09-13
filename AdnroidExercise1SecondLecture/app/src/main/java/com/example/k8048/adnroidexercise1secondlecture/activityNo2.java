package com.example.k8048.adnroidexercise1secondlecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activityNo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_no2);

        TextView textView = (TextView) findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            textView.setText(extras.get("Text").toString());
        }
    }

    public void backButtonActivity(View buttonVies){
        Intent intent = new Intent();
        TextView textView = (TextView) findViewById(R.id.putResultText);
        intent.putExtra("Text", textView.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
