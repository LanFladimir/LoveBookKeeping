package com.fladimir.loversbookkeeping.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.fladimir.loversbookkeeping.activity.main.BillConstant;

/**
 * Created by NingJiang on 2017/6/13.
 * Class Note:本地化帮助类
 */

public class SqlHelper extends SQLiteOpenHelper {

    public SqlHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public SqlHelper(Context context) {
        super(context, BillConstant.DATABASE_NAME, null, BillConstant.DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "creat table" + BillConstant.TABLE_NAME
                + "(" + BillConstant._ID + "Integer primary key+,"
                + BillConstant.BILL_NAME + "verchar(10),"
                + BillConstant.BILL_TYPE + "Integer)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
