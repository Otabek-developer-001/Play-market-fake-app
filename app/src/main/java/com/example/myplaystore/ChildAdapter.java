package com.example.myplaystore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myplaystore.databinding.ChildItemBinding;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.VH>{
    private List<ChildModels> childModelsList;
    private Context context;
    private onItemClickListener onItemClickListener;

    public ChildAdapter(List<ChildModels> childModelsList,Context context,onItemClickListener onItemClickListener) {
        this.childModelsList = childModelsList;
        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ChildItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        ChildModels childModels = childModelsList.get(position);
        holder.binding.imageTV.setImageResource(childModels.getImage());
        holder.binding.childText1.setText(childModels.getName());
        holder.binding.childText2.setText(childModels.getAmount());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context,SecondActivity.class);
            intent.putExtra("image",childModelsList.get(position).getImage());
            intent.putExtra("name",childModelsList.get(position).getName());
            intent.putExtra("amount",childModelsList.get(position).getAmount());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return childModelsList.size();
    }

    public class VH extends RecyclerView.ViewHolder{
        private ChildItemBinding binding;
        public VH(@NonNull ChildItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    public interface onItemClickListener{
        void onItemClickListener(ChildModels childModels);
    }
}
