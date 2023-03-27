package com.example.lunaiskander;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signups extends AppCompatActivity {

    private EditText email2,passWord;
    private Button signUp, cancel;

    SharedPreferences preferences;

    private FirebaseAuth mAuth;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);

        mAuth = FirebaseAuth.getInstance();

        email2 = findViewById(R.id.email);
        passWord = findViewById(R.id.passWord);
        signUp = findViewById(R.id.signUp);
        cancel = findViewById(R.id.cancel);

        preferences = getSharedPreferences("Userinfo",0);
    }

    

    public void signup (View view){
        String input_mail = email2.getText().toString();
        String input_password = passWord.getText().toString();
        //saves the email value in the preferences and commits the file
        if(input_mail.length()>0)
        { //open preferences file
            SharedPreferences.Editor editor = preferences.edit();
            //save key,value data
            editor.putString("username",input_mail);
            editor.putString("password", input_password);

            editor.apply();

            Intent main_activity= new Intent(this, MainActivity.class);
            startActivity(main_activity);

        }
    }

    public void cancel (View view) {
        Intent i_cancel = new Intent(this, MainActivity.class);
        startActivity(i_cancel);
    }
}