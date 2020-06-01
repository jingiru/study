package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class subActivity extends AppCompatActivity {

    TextView result_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        result_get = findViewById(R.id.result_get);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String email = bundle.getString("email");
        String password = bundle.getString("password");

        result_get.setText(email + " / " +password);
    }
}