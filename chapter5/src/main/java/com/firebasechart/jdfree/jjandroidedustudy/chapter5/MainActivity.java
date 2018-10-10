
package com.firebasechart.jdfree.jjandroidedustudy.chapter5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BlankFragment mBlankFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBlankFragment = (BlankFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment1);
    }

    public void inputButton(View view) {
        EditText fragmentEditText = mBlankFragment.getEditText();

        TextView textView = findViewById(R.id.textViewActivity);
        textView.setText(fragmentEditText.getText());
    }

    public void outputButton(View view) {
        EditText activityEditText = findViewById(R.id.editTextActivity);

        TextView fragmentTextView = mBlankFragment.getTextView();
        fragmentTextView.setText(activityEditText.getText().toString());
    }
}
