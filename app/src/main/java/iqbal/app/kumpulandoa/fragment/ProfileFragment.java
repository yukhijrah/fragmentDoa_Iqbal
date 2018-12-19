package iqbal.app.kumpulandoa.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import iqbal.app.kumpulandoa.R;

public class ProfileFragment extends Fragment {
    public TextView namaLengkap, ttl, nim, prodi, kampus;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        namaLengkap = (TextView) view.findViewById(R.id.txt_namaLengkap);
        ttl = (TextView) view.findViewById(R.id.txt_ttl);
        nim = (TextView) view.findViewById(R.id.txt_nim);
        prodi = (TextView) view.findViewById(R.id.txt_prodi);
        kampus = (TextView) view.findViewById(R.id.txt_kampus);

        namaLengkap.setText("Iqbal Ajie Wahyudin");
        ttl.setText("Jakarta, 25 Desember 1997");
        nim.setText("0110216057");
        prodi.setText("Teknik Informatika");
        kampus.setText("STT Terpadu Nurul Fikri");
    }
}
