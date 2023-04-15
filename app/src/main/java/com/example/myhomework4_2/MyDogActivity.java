package com.example.myhomework4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyDogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dog);
    }
    // обработка нажатия кнопки
    public void onClickB(View view) {
        Intent intent = new Intent(this, MyCatActivity.class);
        startActivity(intent);
    }
}