package com.test.kim_eojin.dailydiarydisign;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 936999fefe75ac007d87def0d0af50669fef4e17
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
<<<<<<< HEAD
=======

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, LoginActivity.class));
        finish();
>>>>>>> 936999fefe75ac007d87def0d0af50669fef4e17
    }
}
