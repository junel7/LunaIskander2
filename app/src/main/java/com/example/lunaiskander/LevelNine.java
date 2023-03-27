package com.example.lunaiskander;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LevelNine extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_nine);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);
    }

    // this method loads the menu design into this activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    //handle options menu click events

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.signIn_menu:
                Toast.makeText(this, "sign in clicked", Toast.LENGTH_SHORT).show();//open help activity when the help activity is selected
                // this is from where, and the second parameter is to where
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

            case R.id.home_menu:
                Toast.makeText(this, "Home page clicked", Toast.LENGTH_SHORT).show();
                Intent k = new Intent(this, HomeActivity.class);
                startActivity(k);
                break;


        }
        return true;
    }

    public void answer1 (View view)
    {

        Intent i_answer1 = new Intent(this, LosePage.class);
        startActivity(i_answer1);
    }

    public void answer2 (View view)
    {

        Intent i_answer2 = new Intent(this, WinPage.class);
        startActivity(i_answer2);
    }

    public void answer3 (View view)
    {

        Intent i_answer3 = new Intent(this, LosePage.class);
        startActivity(i_answer3);
    }

    public void answer4 (View view)
    {

        Intent i_answer4 = new Intent(this, LosePage.class);
        startActivity(i_answer4);
    }

}