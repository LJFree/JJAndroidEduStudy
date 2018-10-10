
package com.firebasechart.jdfree.jjandroidedustudy.chapter5;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***
     * 기본적으로 AlertDialog 를 사용하게 되면 화면 전환 시 기능이 없어진다. 이를 소멸이라고도 하며, 생명이 죽었다라고 한다. 생명을
     * 주기 위해서는 여러가지 방법이 있다. 1. 화면을 고정시켜 화면 전환이 불가능 하도록 하는 방법 2. Fragment 를 이용하여 생명주는
     * 방법 다른 방식 - 1회성일 경우 인스턴스화 생략하여 사용
     */
    @Override
    public void onBackPressed() { // 뒤로가기 누르면 실행되는 이벤트
        new AlertDialog.Builder(this).setTitle("종료 할래?").setMessage("진짜 종료할꺼야?")
                .setPositiveButton("종료할래", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("안할래", null).show(); // show는 반드시 해줘야 한다.
    }
}
