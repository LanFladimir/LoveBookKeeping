package com.fladimir.loversbookkeeping.activity.main;

import com.fladimir.loversbookkeeping.model.BillEntity;

import java.util.ArrayList;

/**
 * Created by NingJiang on 2017/6/12.
 * Class Note:
 */

public interface MainContract {
    interface MainVImpl {
        void loadBillList(ArrayList<BillEntity> billList);
    }

    interface MainPImpl {
        //初始化列表数据
        ArrayList<BillEntity> initBillList();

        void CreatGuideBillList();
    }

    interface MainMImpl {

    }
}
