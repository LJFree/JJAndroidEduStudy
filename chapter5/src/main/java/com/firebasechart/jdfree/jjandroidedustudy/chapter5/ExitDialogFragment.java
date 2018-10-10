
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

        return new AlertDialog.Builder(getActivity()).setTitle("종료 할래?").setMessage("진짜 종료할꺼야?")
                .setPositiveButton("종료할래", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().finish();
                    }
                }).setNegativeButton("안할래", null).create(); // 이처럼 return 에서 한번에 끝낼 수도 있다.
    }
}
