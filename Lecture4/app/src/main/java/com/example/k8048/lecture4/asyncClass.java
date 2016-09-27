package com.example.k8048.lecture4;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Created by K8048 on 9/27/2016.
 */

public class asyncClass extends AsyncTask<Void, Integer, Void> {

    private Button asyncButton;
    private ProgressBar progressBar;

    public asyncClass(ProgressBar paPb, Button button){
        asyncButton = button;
        progressBar = paPb;
    }

    @Override
    protected Void doInBackground(Void... params) {

        for (int i =0; i<=100; i++){
            publishProgress(i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                Log.d("APPNAME","Yes, this is exception");
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        asyncButton.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        progressBar.setProgress(values[0]);
    }

    @Override
    protected void onPreExecute() {
        asyncButton.setEnabled(false);
    }
}
