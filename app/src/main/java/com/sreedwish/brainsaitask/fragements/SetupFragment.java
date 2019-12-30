package com.sreedwish.brainsaitask.fragements;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.viewmodel.SetupViewModel;

public class SetupFragment extends Fragment {

    private SetupViewModel mViewModel;

    public static SetupFragment newInstance() {
        return new SetupFragment();
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
