package com.fladimir.loversbookkeeping.base.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by NingJiang on 2017/6/2.
 * Class Note:
 */

public class BaseRecyclerAdapter<P> extends RecyclerView.Adapter<BaseRecyclerHolder> {
    private ArrayList<P> mPList = new ArrayList<P>();
    private int view;


    public BaseRecyclerAdapter(ArrayList<P> PList, int v) {
        mPList = PList;
        view = v;
    }

    @Override
    public BaseRecyclerHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new BaseRecyclerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(view, null));
    }

    @Override
    public void onBindViewHolder(BaseRecyclerHolder baseRecyclerHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mPList != null ? 0 : mPList.size();
    }
}
