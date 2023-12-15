package com.example.project99;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project99.MainActivity;

public class SplashActivity extends AppCompatActivity {

    // 스플래시 화면 표시 시간(ms)
    private static final int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // 핸들러를 사용하여 일정 시간 후에 로그인 액티비티로 이동
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // 현재 액티비티를 종료
            }
        }, SPLASH_TIME_OUT);
    }
}
