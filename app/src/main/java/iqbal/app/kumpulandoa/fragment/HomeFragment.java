package iqbal.app.kumpulandoa.fragment;

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

import iqbal.app.kumpulandoa.R;
import iqbal.app.kumpulandoa.adapter.AdzanAdapter;
import iqbal.app.kumpulandoa.model.ModelAdzan;

public class HomeFragment extends Fragment {

    private List<ModelAdzan> adzans = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.lst_adzan);

        AdzanAdapter adapter = new AdzanAdapter(adzans);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

        adzanCollection();
    }

    private void adzanCollection() {
        adzans.add(new ModelAdzan("Shubuh","04:05"));
        adzans.add(new ModelAdzan("Dzuhur","11:39"));
        adzans.add(new ModelAdzan("Ashar","15:01"));
        adzans.add(new ModelAdzan("Maghrib","17:51"));
        adzans.add(new ModelAdzan("Isya","19:04"));
    }
}
