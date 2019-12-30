package com.sreedwish.brainsaitask.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sreedwish.brainsaitask.models.BeanItem;

import java.util.ArrayList;
import java.util.List;

public class SetupViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    MutableLiveData<List<BeanItem>> liveDataSetup1 = new MutableLiveData<>();
    MutableLiveData<List<BeanItem>> liveDataSetup3 = new MutableLiveData<>();

    public LiveData<List<BeanItem>> getLiveDataSetup1() {

        if (liveDataSetup1.getValue() == null){
            initList1();
        }

        return liveDataSetup1;
    }

    public LiveData<List<BeanItem>> getLiveDataSetup3() {

        if (liveDataSetup3.getValue() == null){
            initList3();
        }

        return liveDataSetup3;
    }

    public void setLiveDataSetup1(List<BeanItem> listDataSetup1) {
        liveDataSetup1.setValue(listDataSetup1);
    }

    public void setLiveDataSetup3(List<BeanItem> listDataSetup3) {
        liveDataSetup3.setValue(listDataSetup3);
    }

    private void initList1(){

        List<BeanItem> list = new ArrayList<>();

        list.add(new BeanItem("Trying to Conceive",true,true,false,30));
        list.add(new BeanItem("Already Pregnant",true,true,false,30));
        list.add(new BeanItem("Delivered our baby",true,true,false,30));
        list.add(new BeanItem("Looking for Adoption",true,true,false,30));

        setLiveDataSetup1(list);

    }

    private void initList3(){

        List<BeanItem> list = new ArrayList<>();

        list.add(new BeanItem("Very Anxious",false,false,false,0));
        list.add(new BeanItem("Little Anxious",false,false,false,0));
        list.add(new BeanItem("Fine",false,false,false,0));
        list.add(new BeanItem("Great",false,false,false,0));

        setLiveDataSetup3(list);
    }



}
