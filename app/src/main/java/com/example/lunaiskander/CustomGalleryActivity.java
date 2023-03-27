package com.example.lunaiskander;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class CustomGalleryActivity extends AppCompatActivity {

    ArrayList<String> f = new ArrayList<>();
    File[] listFile;
    private String folderName = "MyPhotoDir";

    ViewPager mViewPager;

    ViewPagerAdapter mViewPagerAdapter;

    @Override
    public void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getFromSdcard();

        mViewPager = findViewById(R.id.viewPagerMain);

        mViewPagerAdapter = new ViewPagerAdapter(this, f);

        mViewPager.setAdapter(mViewPagerAdapter);

    }

    public void getFromSdcard() {
        File file = new File(getExternalFilesDir(folderName), "/");
        if(file.isDirectory()){
            listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++){
                f.add(listFile[i].getAbsolutePath());
            }
        }
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
}