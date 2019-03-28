package com.example.anu.parkeringuok;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class frontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent frontIntent = new Intent(frontActivity.this, MainActivity.class);
                    startActivity(frontIntent);
                }
            }

        };
        thread.start();
    }

        @Override
        protected void onPause()
        {
            super.onPause();
            finish();
    }
}
