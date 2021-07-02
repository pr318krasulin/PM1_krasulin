package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void ImageClick1 (View view)
    {
        Toast.makeText(this, "Угадал!",Toast.LENGTH_SHORT).show();
    }

    public void ImageClick2 (View view)
    {
        Toast.makeText(this, "Не угадал!",Toast.LENGTH_SHORT).show();
    }


    public void ImageClick3 (View view)
    {
        Toast.makeText(this, "Угадал!",Toast.LENGTH_SHORT).show();
    }

    public void ImageClick4 (View view)
    {
        Toast.makeText(this, "Не угадал!",Toast.LENGTH_SHORT).show();
    }
}