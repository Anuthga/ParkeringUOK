package com.example.anu.parkeringuok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread()
        {
         @Override
         public void run()
         {
             try
             {
                sleep(2000);
             }
             catch (Exception e)
             {
                e.printStackTrace();
             }
             finally
             {
                 Intent frontIntent = new Intent(MainActivity.this, signinActivity.class);
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
