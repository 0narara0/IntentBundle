package com.cmy.www.intentbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

        EditText editTextName = findViewById(R.id.editTextName);
        String editTextNameString = editTextName.getText().toString();
        EditText editTextAge = findViewById(R.id.editTextAge);
        String editTextAgeString = editTextAge.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("Name",editTextNameString);
        bundle.putString("Age",editTextAgeString);
        Intent intent = new Intent(this, ExplicitActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
