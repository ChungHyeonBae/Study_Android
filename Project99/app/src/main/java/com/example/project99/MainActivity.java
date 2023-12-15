package com.example.project99;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 여기에 로그인 로직을 추가할 수 있습니다.
                // 실제로는 인스타그램 API를 사용하여 로그인하는 코드를 작성해야 합니다.
                // 이 예제에서는 간단히 사용자명과 비밀번호를 토스트 메시지로 출력합니다.
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                String message = "Username: " + username + "\nPassword: " + password;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
