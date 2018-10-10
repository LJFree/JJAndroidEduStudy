
package com.firebasechart.jdfree.jjandroidedustudy.chapter5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendButton(View view) {
        BlankFragment blankFragment = (BlankFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment1);

        EditText fragmentString = blankFragment.getEditText();

        TextView textView = findViewById(R.id.textViewActivity);
        textView.setText(fragmentString.getText());
    }
}
