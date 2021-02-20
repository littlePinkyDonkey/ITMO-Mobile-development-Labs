package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button activityOneBtn;
    private Button activityTwoBtn;
    private Button activityThreeBtn;
    private Button activityFourBtn;

    private final View.OnClickListener activityOneListener = (v) -> {
        Intent intent = new Intent(MainActivity.this, ActivityOne.class);
        startActivity(intent);
    };

    private final View.OnClickListener activityTwoListener = (v) -> {
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        startActivity(intent);
    };

    private final View.OnClickListener activityThreeListener = (v) -> {
        Intent intent = new Intent(MainActivity.this, ActivityThree.class);
        startActivity(intent);
    };

    private final View.OnClickListener activityFourListener = (v) -> {
        Intent intent = new Intent(MainActivity.this, ActivityFour.class);
        startActivity(intent);
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityOneBtn = findViewById(R.id.authActivityBtn);
        activityOneBtn.setOnClickListener(activityOneListener);

        activityTwoBtn = findViewById(R.id.profileActivity);
        activityTwoBtn.setOnClickListener(activityTwoListener);

        activityThreeBtn = findViewById(R.id.settingsActivity);
        activityThreeBtn.setOnClickListener(activityThreeListener);

        activityFourBtn = findViewById(R.id.feedbackActivity);
        activityFourBtn.setOnClickListener(activityFourListener);
    }
}
