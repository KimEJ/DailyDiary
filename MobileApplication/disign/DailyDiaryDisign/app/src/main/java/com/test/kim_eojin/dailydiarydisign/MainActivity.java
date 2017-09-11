package com.test.kim_eojin.dailydiarydisign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.mainToolbar));
    }
}
//    해야할 일
//
//      캘린더
//        네비바
//        날씨
// 타이틀바 커스텀