package com.cmy.www.intentbundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExplicitActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit2);

        Bundle bundle1 = getIntent().getExtras();
        TextView textViewValues = (TextView)findViewById(R.id.textView3);
        textViewValues.setText("Values:   "+bundle1.getString("Values","No Data"));
    }
}
