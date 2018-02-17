package com.example.pritam.recyclerviewgridview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Pritam on 2/12/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    private Context mContext;
    private List<Items> mItemsList;

    int lastPosition = -1;

    public MainAdapter(Context context, List<Items> items) {
        this.mContext = context;
        this.mItemsList = items;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_items_adapter_main;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        MainViewHolder viewHolder = new MainViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.mImageViewThumbnail.setImageDrawable(mItemsList.get(position).getmImage());
        holder.mTextViewTitle.setText(mItemsList.get(position).getmTitle());

        if (position > lastPosition){
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.recycler_anim);
            holder.itemView.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return mItemsList.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.thumbnail)
        ImageView mImageViewThumbnail;

        @BindView(R.id.title_text_view)
        TextView mTextViewTitle;

        public MainViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
