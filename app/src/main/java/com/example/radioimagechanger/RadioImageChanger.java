package com.example.radioimagechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class RadioImageChanger extends AppCompatActivity implements View.OnClickListener {

    RadioButton radioButton1, radioButton2, radioButton3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_image_changer);

        radioButton1 = findViewById(R.id.rbImg1);
        radioButton2 = findViewById(R.id.rbImg2);
        radioButton3 = findViewById(R.id.rbImg3);
        imageView = findViewById(R.id.ivShowimg);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.rbImg1 :
                imageView.setImageResource(R.drawable.a);
                break;
            case R.id.rbImg2 :
                imageView.setImageResource(R.drawable.d);
                break;
            case R.id.rbImg3 :
                imageView.setImageResource(R.drawable.h);
                break;
        }

    }
}