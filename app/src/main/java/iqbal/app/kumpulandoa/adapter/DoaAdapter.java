package iqbal.app.kumpulandoa.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import iqbal.app.kumpulandoa.DetailActivity;
import iqbal.app.kumpulandoa.R;
import iqbal.app.kumpulandoa.holder.DoaHolder;
import iqbal.app.kumpulandoa.model.ModelDoa;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {
    private List<ModelDoa> doas;

    public DoaAdapter(List<ModelDoa> doas) {
        this.doas = doas;
    }

    @NonNull
    @Override
    public DoaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_doa, viewGroup, false);
        final DoaHolder doaHolderr = new DoaHolder(itemView);
        doaHolderr.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = doaHolderr.getAdapterPosition();
                Intent intent = new Intent(doaHolderr.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", doas.get(position));
                doaHolderr.itemView.getContext().startActivity(intent);
            }
        });
        return doaHolderr;
    }

    @Override
    public void onBindViewHolder(@NonNull DoaHolder doaHolder, final int i) {
        final ModelDoa doa = doas.get(i);
        doaHolder.namaDoa.setText(doa.getNamaDoa());
        doaHolder.artiDoa.setText(doa.getArtiDoa());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
