
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
public class BlankFragment extends Fragment implements View.OnClickListener {

    private EditText editText;
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        editText = view.findViewById(R.id.editTextFragment1);
        textView = view.findViewById(R.id.textViewFragment1);

        view.findViewById(R.id.sendButton).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        TextView textView = getActivity().findViewById(R.id.textViewActivity);

        textView.setText(editText.getText().toString());
    }
}
