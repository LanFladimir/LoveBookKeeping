package com.fladimir.loversbookkeeping.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by NingJiang on 2017/6/13.
 * Class Note:SqlHelper帮助类  单例
 */

public class DbManager {
    private static SqlHelper sHelper;

    public static SqlHelper getInstance(Context context) {
        if (sHelper == null)
            sHelper = new SqlHelper(context);
        return sHelper;
    }
    /**
     * 查询
     *
     * @param db
     * @param sql
     * @param args
     * @return
     */
    public static Cursor selectFrom(SQLiteDatabase db, String sql, String[] args) {
        Cursor cursor = null;
        if (cursor != null)
            cursor = db.rawQuery(sql, args);
        return cursor;
    }
}
