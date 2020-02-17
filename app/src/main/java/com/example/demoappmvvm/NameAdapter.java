package com.example.demoappmvvm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoappmvvm.Model.Name;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Name> arrayList = new ArrayList<>();

    NameAdapter(Context context, ArrayList<Name> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    public String showData(Name name) {
        String fullName = name.getFirstname() + " " +name.getLastname();
        return fullName;
    }

    public void updateAdapter(Name name)
    {
        arrayList.add(name);
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView fullName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            fullName = itemView.findViewById(R.id.fullName);
        }
    }

    @NonNull
    @Override
    public NameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_view, parent, false);
        ViewHolder nameViewHolder = new ViewHolder(view);
        return nameViewHolder;

    }



    @Override
    public void onBindViewHolder(@NonNull NameAdapter.ViewHolder holder, int position) {

        Name name = arrayList.get(position);
        String fullName = showData(name);
        holder.fullName.setText(fullName);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
