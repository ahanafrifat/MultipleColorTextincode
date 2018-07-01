package com.example.androiddev.multiplecolortextincode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView1 = findViewById(R.id.textView_1);

        Spannable required = new SpannableString("New Text");

        required.setSpan(new ForegroundColorSpan(this.getResources().getColor(R.color.colorPrimary)),0,required.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView1.append(required);
    }
}
