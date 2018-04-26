package com.example.john.tablayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Fav extends Fragment {

    View v;
    RecyclerView recyclerView;
    private ArrayList<Generos> list;
    Bundle bundle;

    public Fragment_Fav() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fav_fragment, container, false);
        bundle = getArguments();
        recyclerView = v.findViewById(R.id.recycleFav_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(list) {
            @Override
            public void recib_event(View view, int posision) {
            }
        };

        if(bundle!=null){
            Generos generos = (Generos)bundle.getSerializable("Activar");
            list.add(0, generos);
            recyclerAdapter.notifyItemInserted(0);
            recyclerAdapter.notifyItemRangeChanged(0, list.size());
        }

        recyclerView.setAdapter(recyclerAdapter);


        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}