package com.example.lunaiskander;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private EditText editTextTextPassword, editTextTextEmailAddress;
    private Button buttonlogin, buttonsignup;
    private TextView PassWord, email;

    private final String valid_mail = "admin";
    private final String valid_password = "1";
    SharedPreferences preferences ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//linking objects with design by id
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);

        buttonlogin = findViewById(R.id.buttonlogin);
        buttonsignup = findViewById(R.id.buttonsignup);
//creates a preferences file,
        preferences = getSharedPreferences("Userinfo",0);

    }

    public void login(View view) {

        // this line gets the registered email and password, in case no user was registered empty string is returned
        if (editTextTextEmailAddress.getText().toString().equals(""))
            Toast.makeText(this, "wrong Email", Toast.LENGTH_LONG).show();

        else if (editTextTextPassword.getText().toString().equals(""))
            Toast.makeText(this, "wrong Password", Toast.LENGTH_LONG).show();

        String input_mail = editTextTextEmailAddress.getText().toString();
        String input_password = editTextTextPassword.getText().toString();

        String registeredMail = preferences.getString("username", "");
        String registeredPassword = preferences.getString("username", "");

        if (input_mail.equals(registeredMail) && input_password.equals(registeredPassword)) {
            Intent i_mail = new Intent(this, HomeActivty.class);
            startActivity(i_mail);
        } else {
            Toast.makeText(this, "incorrect credentials!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {//is called when the user clicks on the back button
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Back button was pressed");
        dialog.setMessage("are you sure you want to exit");
        //in case the user choose no nothing happens and the dialog closes
        dialog.setNegativeButton("no", null);
        //when the user clicks on the yes button the application closes
        dialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();
            }
        });
        dialog.setIcon(R.drawable.ic_baseline_close_24);
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();
    }

        public void singUp (View view)
        {
            Intent i_singup = new Intent(this, signuppage.class);
            startActivity(i_singup);
        }

    public void signUp(View view) {

    }
}
