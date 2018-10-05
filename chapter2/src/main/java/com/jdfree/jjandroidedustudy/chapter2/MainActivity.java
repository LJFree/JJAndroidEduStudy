package com.jdfree.jjandroidedustudy.chapter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Fragment 이벤트!
        // Fragment 이벤트 처리는 Activity 같이 xml에 OnClick 함수가 안된다.

        // 따라서 해당 Fragment의 java코드를 추가 해야한다.

        // Fragment 기본 코드는 아래와 같은 코드로 나온다.
////////////////////////////////////////////////////////////////////////////////////////////////////
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                Bundle savedInstanceState) {
//              // Inflate the layout for this fragment
//
//              return inflater.inflate(R.layout.fragment_blank2, container, false);
//        }
////////////////////////////////////////////////////////////////////////////////////////////////////
        // 위 코드의 inflater.inflate(R.layout.fragment_blank2, container, false); 는
        // Fragment의 기본 화면이다.
        // Fragment의 기본 화면을 return 함으로 써 기본 화면 뷰와 기능을 만들 수 있다.
        // 기본 적인 기능만 return을 하는 것이다.
        // 때문에 아래와 같이 코드 수정하여 버튼 이벤트를 만들 수 있다.
        // 이는 자바에서 사용하는 기본적인 익명(1회성) 이벤트 처리 방법이다.
        // (재 사용 이벤트 일 경우 클래스를 객체로 만들어 인스턴스화 하여 사용하는 것이 좋다.)


////////////////////////////////////////////////////////////////////////////////////////////////////
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                Bundle savedInstanceState) {
//              // Inflate the layout for this fragment
//
//              View view = inflater.inflate(R.layout.fragment_blank2, container, false);
//              Button button = view.findViewById(R.id.fragment2_button);
//              button.setOnClickListener(new View.OnClickListener() {
//                  @Override
//                  public void onClick(View v) {
//                      // 이벤트 처리 내용
//                  }
//              });
//              return view;
//        }
    }
}
