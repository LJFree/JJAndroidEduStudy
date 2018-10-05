package com.jdfree.jjandroidedustudy.chapter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Fragment 는 화면 조각 나누는 구역이다.
        // 화면 뷰의 Fragment를 사용하기 위해서는 Fragment 관련 디자인(xml), 기능(java)가 있어야 한다.
        // (DialogFragment 와 같은 Fragment는 디자인(xml) 창 없어도 가능하다.)

        // 각각의 xml과 java를 생성하여 연결하여 되며, 쉬운 방법으로는
        // 우클릭 -> new -> Fragment를 클릭하여 마법사를 통하여 쉽게 만들 수 있다.
        // 마법사로 통하여 만들 시 아래의 내용을 체크 해제한다.
        // Include fragment factory methods?
        // Include interface callbacks?
        // (이유 : 추 후에 Fragment 소통을 위하여 사용한다. 지금은 기초적인 Fragment로 인하여 필요 없다.)
    }
}
