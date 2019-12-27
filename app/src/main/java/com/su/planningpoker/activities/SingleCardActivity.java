package com.su.planningpoker.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.su.planningpoker.R;

public class SingleCardActivity extends AppCompatActivity {

    private ImageView singleIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_card);


        singleIcon = findViewById(R.id.singleIcon);

        int selectedLogoId = getIntent().getIntExtra("IMAGE_ID", R.drawable.ic_npm_logo);
        singleIcon.setImageResource(selectedLogoId);
    }
}
