package com.fladimir.loversbookkeeping.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fladimir.loversbookkeeping.R;
import com.fladimir.loversbookkeeping.model.BillEntity;

import java.util.ArrayList;

/**
 * Created by NingJiang on 2017/5/27.
 * Class Note:BillAdapter
 */

public class BillsAdapter extends RecyclerView.Adapter<BillsAdapter.billHolder> {
    private ArrayList<BillEntity> mBillList = new ArrayList<>();

    public BillsAdapter(ArrayList<BillEntity> billList) {
        mBillList = billList;
    }

    @Override
    public billHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new billHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bill,null));
    }

    @Override
    public void onBindViewHolder(billHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mBillList.size();
    }

    class billHolder extends RecyclerView.ViewHolder {

        public billHolder(View itemView) {
            super(itemView);
        }
    }
}
