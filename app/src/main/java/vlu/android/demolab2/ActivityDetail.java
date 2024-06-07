package vlu.android.demolab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetail extends AppCompatActivity {

    TextView tvKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        addControl();
        //-----------------------------
        Intent intent= getIntent();
        String st = intent.getStringExtra("username");
        tvKq.setText("Xin chao " + st);



    }
    void addControl()
    {
        tvKq = (TextView)findViewById(R.id.tvKq);
    }
}