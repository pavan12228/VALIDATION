package com.example.ravi.fabwithmenu;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     TextInputLayout TextInputEmail,TextInputpassword;
      EditText etEmail,etPassword;
    Button btnLogin;
      String email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TextInputEmail= (TextInputLayout) findViewById(R.id.TextInputEmail);
         TextInputpassword= (TextInputLayout) findViewById(R.id.TextInputpassword);
          etEmail= (EditText) findViewById(R.id.etEmail);
          etPassword= (EditText) findViewById(R.id.etPassword);
        btnLogin= (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               email=etEmail.getText().toString().trim();
               password=etPassword.getText().toString().trim();
                   if (TextUtils.isEmpty(email)){
                       TextInputEmail.setError("please enter the email ");
                   }
                    else {
                       TextInputEmail.setError(null);
                   }
                if (TextUtils.isEmpty(password)){
                    TextInputpassword.setError(" please enter the password");
                }  else {
                    TextInputpassword.setError(null);
                }

            }
        });
    }
}
