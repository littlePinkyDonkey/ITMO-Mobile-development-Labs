package com.example.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityOne extends AppCompatActivity {
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        view = findViewById(R.id.conditionsTextView);

        view.setText(Html.fromHtml("При входе вы соглашаетесь <a href=\"www.google.com\">с условиями</a>"));
        view.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void onClose(View view) {
        Intent intent = new Intent(ActivityOne.this, MainActivity.class);
        startActivity(intent);
    }
}
