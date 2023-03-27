package com.example.lunaiskander;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    Button LevelOne, LevelTwo, LevelThree, LevelFour, LevelFive, LevelSix, LevelSeven, LevelEight, LevelNine;
    ImageButton LevelTen;
    private TextView Levels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent notification = new Intent(this, Receiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast (this, 1, notification, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager)
                this.getSystemService(Context.ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC, System.currentTimeMillis(), 3000, pendingIntent);

        
        LevelOne = findViewById(R.id.LevelOne);
        LevelTwo = findViewById(R.id.LevelTwo);
        LevelThree = findViewById(R.id.LevelThree);
        LevelFour = findViewById(R.id.LevelFour);
        LevelFive = findViewById(R.id.LevelFive);
        LevelSix = findViewById(R.id.LevelSix);
        LevelSeven = findViewById(R.id.LevelSeven);
        LevelEight = findViewById(R.id.LevelEight);
        LevelNine = findViewById(R.id.LevelNine);
        LevelTen = findViewById(R.id.LevelTen);


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


    public void LevelOne (View view)
    {

        Intent i_levelOne = new Intent(this, LevelOne.class);
        startActivity(i_levelOne);
    }

    public void LevelTwo (View view)
    {

        Intent i_levelTwo = new Intent(this, LevelTwo.class);
        startActivity(i_levelTwo);
    }

    public void LevelThree (View view)
    {

        Intent i_levelThree = new Intent(this, LevelThree.class);
        startActivity(i_levelThree);
    }

    public void LevelFour (View view)
    {

        Intent i_levelFour = new Intent(this, LevelFour.class);
        startActivity(i_levelFour);
    }

    public void LevelFive (View view)
    {

        Intent i_levelFive = new Intent(this, LevelFive.class);
        startActivity(i_levelFive);
    }

    public void LevelSix (View view)
    {

        Intent i_levelSix = new Intent(this, LevelSix.class);
        startActivity(i_levelSix);
    }

    public void LevelSeven (View view)
    {

        Intent i_levelSeven = new Intent(this, LevelSeven.class);
        startActivity(i_levelSeven);
    }

    public void LevelEight (View view)
    {

        Intent i_levelEight = new Intent(this, LevelEight.class);
        startActivity(i_levelEight);
    }

    public void LevelNine (View view)
    {

        Intent i_levelNine = new Intent(this, LevelNine.class);
        startActivity(i_levelNine);
    }

    public void LevelTen (View view)
    {

        Intent i_levelTen = new Intent(this, LevelTen.class);
        startActivity(i_levelTen);
    }
}
