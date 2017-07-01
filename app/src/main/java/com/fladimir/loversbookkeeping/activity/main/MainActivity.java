package com.fladimir.loversbookkeeping.activity.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.fladimir.jutils.tools.Logger.Logger;
import com.fladimir.jutils.tools.SpHelper;
import com.fladimir.loversbookkeeping.R;
import com.fladimir.loversbookkeeping.activity.we.LoversActivity;
import com.fladimir.loversbookkeeping.adapter.BillsAdapter;
import com.fladimir.loversbookkeeping.base.BookApplication;
import com.fladimir.loversbookkeeping.base.recycler.TestItemDecoration;
import com.fladimir.loversbookkeeping.model.BillEntity;

import java.util.ArrayList;

/**
 * RecyclerViewAnim
 */

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener, MainContract.MainVImpl {
    private Context mContext;
    private FloatingActionButton fab;
    private RecyclerView main_recycler;
    private SwipeRefreshLayout main_swipe;
    private ArrayList<BillEntity> mBillList = new ArrayList<>();
    private MainPresenter mMainPresenter;
    private boolean newOpen = SpHelper.firstOpen(BookApplication.mInstance);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainPresenter = new MainPresenter(this);
        //load BillGuide
        if (newOpen) mMainPresenter.CreatGuideBillList();

        mContext = MainActivity.this;
        fab = (FloatingActionButton) findViewById(R.id.fab);
        main_recycler = (RecyclerView) findViewById(R.id.main_recycler);
        main_swipe = (SwipeRefreshLayout) findViewById(R.id.main_swipe);
        main_swipe.setColorSchemeColors(ContextCompat.getColor(mContext, R.color.login_deep),
                ContextCompat.getColor(mContext, R.color.login_indicator));
        main_swipe.setOnRefreshListener(this);
        fab.setOnClickListener(view -> Toast.makeText(mContext, "New Pay", Toast.LENGTH_SHORT).show());
        initToolBar();

        mMainPresenter.initBillList();
    }

    //init ToolBar
    private void initToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("全部");
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.inflateMenu(R.menu.menu_empty);
        toolbar.setTitleTextAppearance(mContext, R.style.toolbartext);
        toolbar.setSubtitleTextAppearance(mContext, R.style.toolbartext);
        //toolbar.setBackgroundColor(ContextCompat.getColor(mContext, R.color.login_deep));
        toolbar.setOverflowIcon(ContextCompat.getDrawable(mContext, R.drawable.ic_menu));
        toolbar.setNavigationIcon(R.drawable.ic_we);
        toolbar.setNavigationOnClickListener(view ->
                startActivity(new Intent(mContext, LoversActivity.class)));
    }

    @Override
    public void onRefresh() {

    }

    /**
     * 加载列表
     *
     * @param billList
     */
    @Override
    public void loadBillList(ArrayList<BillEntity> billList) {
        for (BillEntity entity : billList) {
            Logger.e("查询", entity.getBillName());
        }
        main_recycler.setAdapter(new BillsAdapter(billList));
        main_recycler.addItemDecoration(new TestItemDecoration());
    }
}
