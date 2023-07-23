package com.azhar.daftarpesantren.sekolah;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.azhar.daftarpesantren.R;

import androidx.annotation.NonNull;

import java.util.List;

public class SekolahAdapter extends RecyclerView.Adapter<SekolahAdapter.ViewHolder> {
    private List<ModelSekolah> sekolahList;

    public SekolahAdapter(List<ModelSekolah> sekolahList) {
        this.sekolahList = sekolahList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaSekolah;
        TextView tvNpsn;
        TextView tvAlamat;
        TextView tvKecamatan;
        TextView tvKabupaten;
        TextView tvPropinsi;
        TextView tvStatus;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaSekolah = itemView.findViewById(R.id.tvNamaSekolah);
            tvNpsn = itemView.findViewById(R.id.tvNpsn);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
            tvKecamatan = itemView.findViewById(R.id.tvKecamatan);
            tvKabupaten = itemView.findViewById(R.id.tvKabupaten);
            tvPropinsi = itemView.findViewById(R.id.tvPropinsi);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }

    @NonNull
    @Override
    public SekolahAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data_sekolah, parent, false);
        return new SekolahAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelSekolah sekolah = sekolahList.get(position);
        holder.tvNamaSekolah.setText(sekolah.getNama_sekolah());
        holder.tvNpsn.setText("NPSN: " + sekolah.getNpsn());
        holder.tvAlamat.setText("Alamat: " + sekolah.getAlamat_jalan());
        holder.tvKecamatan.setText("Kecamatan: " + sekolah.getKecamatan());
        holder.tvKabupaten.setText("Kabupaten: " + sekolah.getKabupaten());
        holder.tvPropinsi.setText("Propinsi: " + sekolah.getPropinsi());
        holder.tvStatus.setText("Status: " + sekolah.getStatus());
    }

    @Override
    public int getItemCount() {
        return sekolahList.size();
    }
}

