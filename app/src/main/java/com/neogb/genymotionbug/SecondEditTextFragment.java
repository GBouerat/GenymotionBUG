package com.neogb.genymotionbug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SecondEditTextFragment extends Fragment {

    public static final String TAG = "EditTextFragment";

    private static final String ARG_TEXT = "arg:text";

    private EditText mEditText;

    public static Fragment newInstance(String text) {
        SecondEditTextFragment fragment = new SecondEditTextFragment();
        Bundle args = new Bundle(1);
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second_edittext, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mEditText = ((EditText) view.findViewById(R.id.comment_text));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState == null) {
            String text = getArguments().getString(ARG_TEXT);
            if (!TextUtils.isEmpty(text)) {
                mEditText.append(text);
            }
        }
    }

}
