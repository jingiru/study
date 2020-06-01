package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    TextInputEditText TextInputEditText_Email;
    TextInputEditText TextInputEditText_Password;
    TextView moveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String EmailOK = "123@gmail.com";
        String PasswordOK = "sss";


        TextInputEditText_Email = findViewById(R.id.TextInputEditText_Email);
        TextInputEditText_Password = findViewById(R.id.TextInputEditText_Password);
        TextView moveButton = findViewById(R.id.moveButton);

        //1. 값을 가져온다.
        //2. 클릭을 감지한다.
        //3. 1번의 값을 다음 액티비티로 넘긴다

        TextInputEditText_Email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("check",s+","+count);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        TextInputEditText_Password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("check",s+","+count);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        moveButton.setClickable(true);
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = TextInputEditText_Email.getText().toString();
                String Password = TextInputEditText_Password.getText().toString();

                Intent intent = new Intent(MainActivity.this, subActivity.class);
                intent.putExtra("email",Email);
                intent.putExtra("password",Password);
                startActivity(intent);
            }
        });

    }

}