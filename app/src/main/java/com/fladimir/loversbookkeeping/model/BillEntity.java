package com.fladimir.loversbookkeeping.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by NingJiang on 2017/5/27.
 * Class Note:账单实体
 */
public class BillEntity {
    private int id;
    private int billType;
    private String billName;
    public BillEntity(int id, int billType, String billName) {
        this.id = id;
        this.billType = billType;
        this.billName = billName;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBillType() {
        return this.billType;
    }
    public void setBillType(int billType) {
        this.billType = billType;
    }
    public String getBillName() {
        return this.billName;
    }
    public void setBillName(String billName) {
        this.billName = billName;
    }
}
