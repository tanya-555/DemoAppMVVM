package com.example.demoappmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.demoappmvvm.Model.Name;
import com.example.demoappmvvm.viewmodel.NameViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView name_recyclerview;
    private static ArrayList<Name> arrayList;
    public NameAdapter adapter;
    public NameViewModel nameViewModel;
    MainActivity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        name_recyclerview = findViewById(R.id.name_recyclerview);
        //nameViewModel = ViewModelProviders.of(this).get(NameViewModel.class);
        nameViewModel= new ViewModelProvider(this).get(NameViewModel.class);;
        nameViewModel.getNameLiveData().observe(context, userListUpdateObserver);

    }
    Observer<ArrayList<Name>> userListUpdateObserver = new Observer<ArrayList<Name>>() {
        @Override
        public void onChanged(ArrayList<Name> userArrayList) {
            adapter = new NameAdapter(context,userArrayList);
            name_recyclerview.setLayoutManager(new LinearLayoutManager(context));
            name_recyclerview.setAdapter(adapter);
        }
    };


}
