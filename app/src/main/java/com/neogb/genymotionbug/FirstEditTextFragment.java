package com.neogb.genymotionbug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class FirstEditTextFragment extends Fragment {

    public static final String TAG = "EditTextFragment";

    private EditText mEditText;

    public static Fragment newInstance() {
        return new FirstEditTextFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first_edittext, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mEditText = (EditText) view.findViewById(R.id.comment_text);
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SecondActivity.class);
                intent.putExtra(SecondActivity.EXTRA_TEXT, mEditText.getText().toString());

                mEditText.setText(null);

                startActivity(intent);
            }

        });
    }

}
