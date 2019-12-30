package com.sreedwish.brainsaitask.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.fragements.SetupFragment;

public class Setup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setup_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SetupFragment.newInstance())
                    .commitNow();
        }
    }
}
