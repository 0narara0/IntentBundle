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
        TextView textView = (TextView)findViewById(R.id.singleName);
        textView.setText("SingleName:   "+bundle.getString("SingleName","No Data"));
    }
}
