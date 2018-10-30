package com.cmy.www.intentbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String text = ((Button)v).getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("SingleName",text);
        Intent intent = new Intent(this, ExplicitActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
