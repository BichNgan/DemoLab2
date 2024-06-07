package vlu.android.demolab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AcvivityLab2B1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acvivity_lab2_b1);
        //--------------------------------
        Log.d("Thông báo của Ngân","Hàm onCreate được gọi");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Thông báo của Ngân","Hàm onDestroy được gọi");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Thông báo của Ngân","Hàm onResume được gọi");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Thông báo của Ngân","Hàm onRestart được gọi");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Thông báo của Ngân","Hàm onStart được gọi");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Thông báo của Ngân","Hàm onStop được gọi");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Thông báo của Ngân","Hàm onPause được gọi");
    }
}