package iqbal.app.kumpulandoa.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import iqbal.app.kumpulandoa.R;
import iqbal.app.kumpulandoa.holder.AdzanHolder;
import iqbal.app.kumpulandoa.model.ModelAdzan;

public class AdzanAdapter extends RecyclerView.Adapter<AdzanHolder> {

    private List<ModelAdzan> adzans = new ArrayList<>();
    public AdzanAdapter(List<ModelAdzan> adzans) {
        this.adzans = adzans;
    }

    @NonNull
    @Override
    public AdzanHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_adzan, viewGroup, false);
        final AdzanHolder adzanHolder = new AdzanHolder(itemView);
        return adzanHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdzanHolder adzanHolder, int i) {
        final ModelAdzan adzan = adzans.get(i);
        adzanHolder.namaSholat.setText(adzan.getNamaSholat());
        adzanHolder.waktuSholat.setText(adzan.getWaktuSholat());
    }

    @Override
    public int getItemCount() {
        return adzans.size();
    }
}
