package com.sreedwish.brainsaitask.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.sreedwish.brainsaitask.R;
import com.sreedwish.brainsaitask.databinding.RecycleItemBinding;
import com.sreedwish.brainsaitask.models.BeanItem;
import com.sreedwish.brainsaitask.utils.ItemClickListener;

import java.util.List;

public class Recycler_item_adapter extends RecyclerView.Adapter<Recycler_item_adapter.ViewHolder> {

    LayoutInflater inflater;

    List<BeanItem> itemList;

    ItemClickListener listener;


    public Recycler_item_adapter(List<BeanItem> itemList, ItemClickListener listener) {
        this.itemList = itemList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (inflater == null){
            inflater = LayoutInflater.from(parent.getContext());
        }

        RecycleItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.recycle_item,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        final BeanItem item = itemList.get(position);

        if (item != null){

            holder.binding.setDat(item);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item, position);

                }
            });

        }

    }

    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecycleItemBinding binding;

        public ViewHolder(@NonNull RecycleItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
