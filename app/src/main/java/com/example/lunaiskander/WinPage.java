package com.example.lunaiskander;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class WinPage extends AppCompatActivity {

    Button Continue;
    ImageButton Camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_page);

        Continue = findViewById(R.id.Continue);
        Camera = findViewById(R.id.Camera);
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

    public void Continue (View view)
    {

        Intent i_Continue = new Intent(this, HomeActivity.class);
        startActivity(i_Continue);
    }

    public void Camera (View view)
    {

        Intent i_Camera = new Intent(this, camraactivity.class);
        startActivity(i_Camera);
    }
}