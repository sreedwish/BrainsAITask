package com.sreedwish.brainsaitask.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.adapters.ViewPagerAdapter;
import com.sreedwish.brainsaitask.databinding.SetupActivityBinding;
import com.sreedwish.brainsaitask.fragements.SetupFragment1;

public class Setup extends AppCompatActivity {

    SetupActivityBinding binding;

    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.setup_activity);

        setupViewPager();

    }

    private void setupViewPager() {

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        SetupFragment1 fragment1 = SetupFragment1.newInstance();

        viewPagerAdapter.addFragment(fragment1,"frag1");

        binding.viewPager.setAdapter(viewPagerAdapter);


    }
}
