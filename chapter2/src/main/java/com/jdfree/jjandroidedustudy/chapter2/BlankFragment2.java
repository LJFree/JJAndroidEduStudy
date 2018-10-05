package com.jdfree.jjandroidedustudy.chapter2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.jdfree.jjandroidedustudy.chapter2.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {


    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);

        Button button = view.findViewById(R.id.fragment2_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Toast.makeText(getActivity(), "Fragment2 버튼입니다!_getActivity", Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), "Fragment2 버튼입니다!_getContext", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
