package com.example.park.tabexample;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUI();
    }

    // 화면 UI를 설정하는 메소드
    private void setUpUI() {
        // Tabs를 처리하는 호스트 클래스
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        // tab을 생성한다.
        TabHost.TabSpec tab1 = tabHost.newTabSpec("나는");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("역사");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("연락");

        // Tab과 activity를 연결한다.
        tab1.setIndicator("나는");
        tab1.setContent(new Intent(this, AboutMeAcitivity.class));

        tab2.setIndicator("역사");
        tab2.setContent(new Intent(this, historyActivity.class));

        tab3.setIndicator("연락");
        tab3.setContent(new Intent(this,contactActivity.class));

        /** 탭을 붙인다. */
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }


}
