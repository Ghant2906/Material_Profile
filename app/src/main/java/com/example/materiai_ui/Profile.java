package com.example.materiai_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    Button btnBack, btnFL;
    TextView followerTextView;
    int followerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnBack = (Button) findViewById(R.id.backButton);
        btnFL = (Button) findViewById(R.id.button);
        followerTextView = (TextView) findViewById(R.id.fllowerText);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(Profile.this, MainActivity.class);
                startActivity(main);
            }
        });

        btnFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnFL.getText().equals("Follow")) {
                    followerText =Integer.parseInt(followerTextView.getText().toString()) + 1;
                    followerTextView.setText("0"+followerText);
                    btnFL.setText("UnFollow");
                }
                else {
                    followerText =Integer.parseInt(followerTextView.getText().toString()) - 1;
                    followerTextView.setText("0"+followerText);
                    btnFL.setText("Follow");}
            }
        });

    }
}