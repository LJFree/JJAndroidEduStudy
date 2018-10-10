
package com.firebasechart.jdfree.jjandroidedustudy.chapter5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

public class ExitDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("종료 할래?").setMessage("진짜 종료할꺼야?")
                .setPositiveButton("종료할래", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().finish();
                    }
                }).setNegativeButton("안할래", null); // MainActivity 에서 show 를 하기 떄문에 여기에서는 생략

        return builder.create(); // 반드시 AlertDialog.Builder 클래스 형태로 만든 builder 변수를 생성하는 것을 return
                                 // 해줘야 한다.
    }
}
