package com.sreedwish.brainsaitask.fragements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.viewmodel.SetupViewModel;

public class SetupFragment2 extends Fragment {

    private SetupViewModel mViewModel;

    public static SetupFragment2 newInstance() {
        return new SetupFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.setup_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SetupViewModel.class);
        // TODO: Use the ViewModel
    }



}
