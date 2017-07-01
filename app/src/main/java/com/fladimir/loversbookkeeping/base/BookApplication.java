package com.fladimir.loversbookkeeping.base;

import android.app.Application;

import com.fladimir.jutils.tools.SpHelper;


/**
 * Created by NingJiang on 2017/5/31.
 * Class Note:
 */

public class BookApplication extends Application {
    //private DaoSession daoSession;
    public static BookApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        /*if (new SpHelper(this).firstOpen())
            firstOpen();
*/
        SpHelper.setFirstOpen(this, true);
        //Toast
        /*Toasty.Config.getInstance()
                .setErrorColor(Color.RED) // optional
                .setInfoColor(ContextCompat.getColor(this, R.color.login_deep)) // optional
                .setSuccessColor(Color.GREEN) // optional
                .setWarningColor(Color.parseColor("#FFA900")) // optional
                .setTextColor(Color.parseColor("#FFA900")) // optional
                .tintIcon(false) // optional (apply textColor also to the icon)
                .setToastTypeface(Typeface.create("sans-serif-condensed", Typeface.NORMAL)) // optional
                .setTextSize(14) // optional
                .apply(); // required*/
    }

    /**
     * first open:
     */
    private void firstOpen() {
        //load guide data
        /*DevOpenHelper helper = new DevOpenHelper(this, ENCRYPTED ? "notes-db-encrypted" : "notes-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("super-secret") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
*/
        //set sp
        SpHelper.setFirstOpen(this, false);
    }

    //public DaoSession getDaoSession() {
    // return daoSession;
    //}
}
