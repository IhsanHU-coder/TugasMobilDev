package com.example.login;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Siswa> siswaList;
    private OnItemClickListener listener;

    public Adapter(ArrayList<Siswa> siswaList, OnItemClickListener listener) {
        this.siswaList = siswaList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Siswa siswa = siswaList.get(position);
        holder.tvName.setText(siswa.getName());
        holder.tvAbsen.setText(siswa.getAbsen());
        holder.tvKelas.setText(siswa.getKelas());
        holder.imgMovie.setImageResource(siswa.getImageResId()); // Atur gambar

        holder.itemView.setOnClickListener(v -> listener.onItemClick(siswa));
    }

    @Override
    public int getItemCount() {
        return siswaList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvAbsen, tvKelas;
        ImageView imgMovie; // Tambahkan ImageView

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvItemName);
            tvAbsen = itemView.findViewById(R.id.tvItemAbsen);
            tvKelas = itemView.findViewById(R.id.tvItemKelas);
            imgMovie = itemView.findViewById(R.id.imgMovie); // Hubungkan dengan XML
        }
    }
}
