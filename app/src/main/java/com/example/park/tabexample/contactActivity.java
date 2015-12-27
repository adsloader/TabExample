package com.example.park.tabexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class contactActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView 실행 전에 코딩되어야 한다. 그리고 Activity만 된다.
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_contact);
    }
}
