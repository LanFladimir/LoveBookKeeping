package com.fladimir.loversbookkeeping.activity.main;

import com.android.volley.VolleyError;
import com.fladimir.jutils.volley.VolleyHelper;
import com.fladimir.jutils.volley.VolleyResponseCallback;
import com.fladimir.loversbookkeeping.base.BookApplication;
import com.fladimir.loversbookkeeping.db.DbManager;
import com.fladimir.loversbookkeeping.db.SqlHelper;
import com.fladimir.loversbookkeeping.model.BillEntity;

import java.util.ArrayList;

/**
 * Created by NingJiang on 2017/6/12.
 * Class Note:
 */

public class MainPresenter implements MainContract.MainPImpl {
    MainContract.MainVImpl mMainV;
    SqlHelper mSqlHelper;

    public MainPresenter(MainContract.MainVImpl mainV) {
        mMainV = mainV;
        mSqlHelper = DbManager.getInstance(BookApplication.mInstance);
    }

    /**
     * 创建初始化列表
     */
    @Override
    public void CreatGuideBillList() {
       /* SQLiteDatabase db = mSqlHelper.getWritableDatabase();
        String sql = "insert into"
                + BillConstant.TABLE_NAME + " billName(,'经费')"
                + BillConstant.BILL_NAME + " billName(,'经费')";
        db.execSQL(sql);
        db.close();*/
    }

    /**
     * 加载数据
     *
     * @return
     */
    @Override
    public ArrayList<BillEntity> initBillList() {
        ArrayList<BillEntity> billList = new ArrayList<>();
        /*SQLiteDatabase db = mSqlHelper.getWritableDatabase();
        String sql = BillConstant.TABLE_NAME + "";
        Cursor cursor = DbManager.selectFrom(db, sql, null);
        while (cursor.moveToNext()) {
            int columIndex = cursor.getColumnIndex(BillConstant._ID);
            int _id = cursor.getInt(columIndex);
            String billName = cursor.getString(cursor.getColumnIndex(BillConstant.BILL_NAME));
            int billType = cursor.getInt(cursor.getColumnIndex(BillConstant.BILL_TYPE));
            BillEntity entity = new BillEntity(_id, billType, billName);
            billList.add(entity);
        }*/
        VolleyHelper.sendHttpGet(BookApplication.mInstance, "", new VolleyResponseCallback() {
            @Override
            public void onSuccess(String response) {

            }

            @Override
            public void onError(VolleyError error) {

            }
        });
        return billList;
    }


}
