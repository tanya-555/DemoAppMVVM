package com.example.demoappmvvm.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.demoappmvvm.Api.NameApi;
import com.example.demoappmvvm.Model.Name;

import java.util.ArrayList;

public class NameViewModel extends ViewModel {

    MutableLiveData<ArrayList<Name>> nameLiveData;
    ArrayList<Name> nameArrayList;

    public NameViewModel() {
        nameLiveData = new MutableLiveData<>();
        init();
    }

    public void init() {
        populateList();
        nameLiveData.setValue(nameArrayList);
    }

    public void populateList() {
        NameApi nameApi=new NameApi();
        nameArrayList = nameApi.getList();
    }

    public MutableLiveData<ArrayList<Name>> getNameLiveData() {
        return nameLiveData;
    }
}

