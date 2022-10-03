package com.example.lunaiskander;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signuppage extends AppCompatActivity {

    private EditText email,passWord;
    private Button signUp, buttonCancel;

    SharedPreferences preferences;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

        email = findViewById(R.id.email);
        passWord = findViewById(R.id.passWord);
        signUp = findViewById(R.id.signUp);
        buttonCancel = findViewById(R.id.buttonCancel);

        preferences = getSharedPreferences("Userinfo",0);
    }

    public void signup (View view){
        String input_mail = email.getText().toString();
        String input_password = passWord.getText().toString();
        //saves the email value in the preferences and commits the file
        if(input_mail.length()>0)
        { //open preferences file
            SharedPreferences.Editor editor = preferences.edit();
            //save key,value data
            editor.putString("username",input_mail);
            editor.putString("password", input_password);

            editor.apply();


        }


    }

}