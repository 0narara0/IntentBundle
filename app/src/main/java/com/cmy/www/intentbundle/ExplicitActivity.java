package com.cmy.www.intentbundle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        Bundle bundle = getIntent().getExtras();
        TextView textViewName = (TextView)findViewById(R.id.Name);
        textViewName.setText("Name:   "+bundle.getString("Name","No Data"));
        TextView textViewAge = (TextView)findViewById(R.id.Age);
        textViewAge.setText("Age:    "+bundle.getString("Age","No Data"));

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editTextValues = findViewById(R.id.editTextValues);
        String editTextValuesString = editTextValues.getText().toString();
        Bundle bundle1 = new Bundle();
        bundle1.putString("Values",editTextValuesString);
        Intent intent = new Intent(this, ExplicitActivity2.class);
        intent.putExtras(bundle1);
        startActivity(intent);

    }
}
