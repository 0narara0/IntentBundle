package com.cmy.www.intentbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit);

        Bundle bundle = getIntent().getExtras();
        TextView textViewName = (TextView)findViewById(R.id.Name);
        textViewName.setText("Name:   "+bundle.getString("Name","No Data"));
        TextView textViewAge = (TextView)findViewById(R.id.Age);
        textViewAge.setText("Age:    "+bundle.getString("Age","No Data"));
    }
}
