package com.jdfree.jjandroidedustudy.chapter1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();    // 받은 Intent 가져오고
        String text = intent.getStringExtra(MainActivity.TEXT); // 받은 Intent text 변수에 저장

        TextView textView = findViewById(R.id.textView);    // XML에 있는 textView 불러오기
        textView.setText(text); // XML에 있는 textView에 위에 다른 창에서 받은 intent 값 입력
    }


    public void exitActivityResult(View view) {
        Intent intent = new Intent();   // 값 전달을 위한 Intent 생성

        EditText editText = findViewById(R.id.editText_activity2);  // XML에 있는 editText_activity2 가져오기
        intent.putExtra(MainActivity.TEXT, editText.getText().toString());  // XML에 있는 editText_activity2 값을 Intent에 저장

        setResult(RESULT_OK, intent);   // 이 Activity가 실행 되기 전 Activity에 Intent 오류안나게(RESULT_OK) 전달

        finish();   // Activity 닫기
    }
}
