package com.sreedwish.brainsaitask.fragements;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.adapters.Recycler_item_adapter;
import com.sreedwish.brainsaitask.databinding.SetupFragmentBinding;
import com.sreedwish.brainsaitask.models.BeanItem;
import com.sreedwish.brainsaitask.utils.ItemClickListener;
import com.sreedwish.brainsaitask.viewmodel.SetupViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class SetupFragment1 extends Fragment {

    private SetupViewModel mViewModel;

    private SetupFragmentBinding binding;

    private List<BeanItem> itemList = new ArrayList<>();

    private Recycler_item_adapter adapter;

    private int selected_position = RecyclerView.NO_POSITION;


    public static SetupFragment1 newInstance() {
        return new SetupFragment1();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.setup_fragment,container,false);

        binding.recycler.setVisibility(View.VISIBLE);
        binding.tvMsg.setText(getString(R.string.msg_select_who_you_are));

        initRecyclerView();

        mViewModel.getLiveDataSetup1().observe(this, new Observer<List<BeanItem>>() {
            @Override
            public void onChanged(List<BeanItem> beanItems) {
                itemList.clear();
                itemList.addAll(beanItems);
                adapter.notifyDataSetChanged();
            }
        });

        itemList.addAll(Objects.requireNonNull(mViewModel.getLiveDataSetup1().getValue()));
        adapter.notifyDataSetChanged();

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SetupViewModel.class);
        // TODO: Use the ViewModel
    }

    private void initRecyclerView(){

        adapter = new Recycler_item_adapter(itemList, new ItemClickListener() {
            @Override
            public void onItemClick(BeanItem item, int position) {

                if (selected_position != RecyclerView.NO_POSITION){
                    itemList.get(selected_position).setSelected(false);
                }

                selected_position = position;
                itemList.get(position).setSelected(true);

                mViewModel.setLiveDataSetup1(itemList);


            }
        });

        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycler.setAdapter(adapter);

    }



}
