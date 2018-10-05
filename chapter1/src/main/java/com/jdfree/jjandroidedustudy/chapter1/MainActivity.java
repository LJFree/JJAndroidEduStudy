package com.jdfree.jjandroidedustudy.chapter1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 5000;
    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showActivityResult(View view) {
        // 창 이동하기 위한 Intent
        Intent intent = new Intent(this, Main2Activity.class);

        // XML에서 EditText로 받은 값 가져오기
        EditText textView = findViewById(R.id.editText);
        String strText = textView.getText().toString(); // XML에서 가져온 EditText 문자로 교체

        intent.putExtra(TEXT, strText); // 창 전환 시 사용하는 Intent에 위에서 받은 XML에서 가져온 EditText 값 입력

        startActivityForResult(intent, REQUEST_CODE);   // 화면 전환
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MainActivity.REQUEST_CODE && resultCode == RESULT_OK && data != null) {  // 코드가 맞고, 오류 안나고, 데이터가 있으면

            String result = data.getStringExtra(TEXT);  // 받을 때 전해진 Intent 값 result 변수에 저장

            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();    // result 출력
        }
    }
}
