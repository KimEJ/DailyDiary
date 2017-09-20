package com.test.kim_eojin.dailydiarydisign;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 936999fefe75ac007d87def0d0af50669fef4e17
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
<<<<<<< HEAD
=======
=======
>>>>>>> 936999fefe75ac007d87def0d0af50669fef4e17

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, LoginActivity.class));
        finish();
<<<<<<< HEAD
>>>>>>> 936999fefe75ac007d87def0d0af50669fef4e17
=======
>>>>>>> 936999fefe75ac007d87def0d0af50669fef4e17
    }
}
