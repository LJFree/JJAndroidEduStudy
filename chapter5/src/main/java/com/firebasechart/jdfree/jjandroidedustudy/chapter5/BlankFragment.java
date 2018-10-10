
package com.firebasechart.jdfree.jjandroidedustudy.chapter5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private EditText editText;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        editText = view.findViewById(R.id.editTextFragment1);
        textView = view.findViewById(R.id.textViewFragment1);

        return view;
    }

    public EditText getEditText() {
        return editText;
    }

    public void setEditText(EditText editText) {
        this.editText = editText;
    }

    public void setEditTextValue(String text) {
        this.editText.setText(text);
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }

    public void setTextViewValue(String text) {
        this.textView.setText(text);
    }
}
