package com.example.demoappmvvm.Api;

import com.example.demoappmvvm.Model.Name;

import java.util.ArrayList;
import java.util.List;

public class NameApi {
    public  ArrayList<Name> names;

    public NameApi() {
         names = new ArrayList<>();
        names.add(new Name("Aman","Singh"));
        names.add(new Name("Shubham","Goyal"));
        names.add(new Name("Anu","Jain"));
        names.add(new Name("Arya","Sinha"));
        names.add(new Name("Madan","Mohan"));
        names.add(new Name("Swati","Suman"));
        names.add(new Name("Shruti","Suman"));
        names.add(new Name("Swati","Agrawal"));

    }
    public ArrayList<Name> getList() {
        return names;
    }
}
