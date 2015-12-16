package com.neogb.genymotionbug;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public static String EXTRA_TEXT = BuildConfig.APPLICATION_ID + ".extra:text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            Fragment fragment = SecondEditTextFragment.newInstance(getIntent().getStringExtra(EXTRA_TEXT));
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content, fragment, SecondEditTextFragment.TAG)
                    .commit();
        }

    }


}
