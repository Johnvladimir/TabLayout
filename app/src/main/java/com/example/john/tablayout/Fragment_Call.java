package com.example.john.tablayout;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Call extends Fragment {

    View v;
    private RecyclerView myRecycleView;
    private List<Generos> lstCall;

    public Fragment_Call() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.call_fragment, container, false);
        myRecycleView = v.findViewById(R.id.recycle_id);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), lstCall) {
            @Override
            public void recib_event(View view, int posision) {
                if (lstCall.get(posision).isBool()) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("Activar", lstCall.get(posision));
                    Fragment_Fav f = new Fragment_Fav();
                    f.setArguments(bundle);
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.layout_fav, f).commit();
                }
            }
        };
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstCall = new ArrayList<>();
        lstCall.add(new Generos("David Guetta,Avicii,Skrillex", R.drawable.dj));
        lstCall.add(new Generos("Metallica,AC/DC,Iron Maiden", R.drawable.rock));
        lstCall.add(new Generos("Bono, Billy Joel, Thom Yorke", R.drawable.clasica));
    }
}