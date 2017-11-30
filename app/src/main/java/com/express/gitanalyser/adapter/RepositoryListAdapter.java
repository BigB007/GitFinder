package com.express.gitanalyser.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.express.gitanalyser.R;
import com.express.gitanalyser.model.RepositoryItem;
import com.express.gitanalyser.views.RepositoryHolder;

import java.util.List;

/**
 * Created by root on 29/11/17.
 */

public class RepositoryListAdapter extends RecyclerView.Adapter<RepositoryHolder> {

    public static final String TAG= "REPOSITORY LIST ADAPTER";
    private List<RepositoryItem> mRepositoryItemList;

    @Override
    public RepositoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = null;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.snippet_repository_card, parent, false);
        return new RepositoryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RepositoryHolder holder, int position) {
        RepositoryItem item = mRepositoryItemList.get(position);
        holder.bind(item.mName, item.mFullName, item.mWatchCount, item.mCommitCount);
        //holder.itemView.setOnClickListener();
    }

    @Override
    public int getItemCount() {
        return mRepositoryItemList.size();
    }

}
