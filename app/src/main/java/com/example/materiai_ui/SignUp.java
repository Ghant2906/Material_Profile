package com.example.materiai_ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    Button btnSignUp, btnBackSignIn;

    private void thongBaoDangKy(String title, String mess) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle(title);
        alertDialog.setMessage(mess);
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialog.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnSignUp = (Button) findViewById(R.id.signUpButton_SignUp);
        btnBackSignIn = (Button) findViewById(R.id.backLoginButton_SignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thongBaoDangKy("Succesful","Đăng ký thành công. Vui lòng đăng nhập");
                if(isTaskRoot()){
                    Intent main = new Intent(SignUp.this, MainActivity.class);
                    startActivity(main);
                }
            }
        });

        btnBackSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(SignUp.this, MainActivity.class);
                startActivity(main);
            }
        });
    }
}