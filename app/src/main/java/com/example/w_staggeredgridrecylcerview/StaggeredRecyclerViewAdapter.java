package com.example.w_staggeredgridrecylcerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class StaggeredRecyclerViewAdapter extends  RecyclerView.Adapter<StaggeredRecyclerViewAdapter.StaggeredReyclerViewHolder>{
    private List<ItemImag> mData; //itemImag裡面屬性是配合 imagvie的int

    public StaggeredRecyclerViewAdapter(List<ItemImag> mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public StaggeredReyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StaggeredReyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_staggered_gird,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredReyclerViewHolder holder, int position) {
        holder.setImageView(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public  static class StaggeredReyclerViewHolder extends RecyclerView.ViewHolder {
        private RoundedImageView roundImg;
        public StaggeredReyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            roundImg = itemView.findViewById(R.id.roundImg);
        }

        //7.在ViewHolder裡面寫一個  setPostImage方法,因為想配合ItemImag的社imagViewResours
        public void setImageView(ItemImag imageView){
            roundImg.setImageResource(imageView.getImg());
        }
    }
}
