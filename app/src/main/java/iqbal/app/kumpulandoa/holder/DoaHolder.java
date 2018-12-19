package iqbal.app.kumpulandoa.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import iqbal.app.kumpulandoa.R;

public class DoaHolder extends RecyclerView.ViewHolder {
    public TextView namaDoa, arabDoa, latinDoa, artiDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        namaDoa = (TextView) itemView.findViewById(R.id.namaDoa);
        arabDoa = (TextView) itemView.findViewById(R.id.arabDoa);
        latinDoa = (TextView) itemView.findViewById(R.id.latinDoa);
        artiDoa = (TextView) itemView.findViewById(R.id.artiDoa);
    }
}
