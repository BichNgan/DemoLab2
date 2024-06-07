package vlu.android.demolab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AcvivityLab2B1 extends AppCompatActivity {
    EditText edtUs, edtPw;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acvivity_lab2_b1);
        //--------------------------------
        Log.d("Thông báo của Ngân","Hàm onCreate được gọi");
        //---------------------------
        addControl();
        //----------------------------
        //Lấy dữ liệu từ sharePreferencen ra
        SharedPreferences  sharedPreferences = getPreferences(MODE_PRIVATE);
        String us  =sharedPreferences.getString("tên đăng nhập",null);
        String pw  =sharedPreferences.getString("mật khẩu",null);
        edtUs.setText(us);
        edtPw.setText(pw);

        //--------------------
        addEvent();

    }
    void addControl()
    {
        edtUs=(EditText) findViewById(R.id.edtUs);
        edtPw = (EditText) findViewById(R.id.edtPw);
        btnLogin = (Button) findViewById(R.id.btnLogin);

    }
    void addEvent()
    {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(AcvivityLab2B1.this,ActivityDetail.class);
                intent.putExtra("username",edtUs.getText().toString());
                startActivity(intent);
            }
        });
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
        //--------------------
        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String us = edtUs.getText().toString();
        String pw = edtPw.getText().toString();

        editor.putString("tên đăng nhập",us);
        editor.putString("mật khẩu",pw);

        editor.commit();


    }
}