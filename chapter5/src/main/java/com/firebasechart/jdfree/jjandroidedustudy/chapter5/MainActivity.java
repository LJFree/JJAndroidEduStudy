
package com.firebasechart.jdfree.jjandroidedustudy.chapter5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /***
     * 기본적으로 AlertDialog 를 사용하게 되면 화면 전환 시 기능이 없어진다. 이를 소멸이라고도 하며, 생명이 죽었다라고 한다. 생명을
     * 주기 위해서는 여러가지 방법이 있다. 1. 화면을 고정시켜 화면 전환이 불가능 하도록 하는 방법 2. Fragment 를 이용하여 생명주는
     * Fragment 이용하여 ExitDialog 만들기 - 다른 방식
     */
    @Override
    public void onBackPressed() { // 뒤로가기 누르면 실행되는 이벤트
        new ExitDialogFragment().show(getSupportFragmentManager(), "exit");
        // tag는 시스템이 필요에 따라 상태 저장, 복원하는 고유태그이다.
        // findFragmentByTag() 함수로 호출하여 해당 프리그먼트를 얻을 수도있다.
        // 본 예제는 태그를 사용하지 않으므로 적당한 이름으로..
    }
}
