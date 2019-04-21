package com.example.lijiacheng.bean;

import java.io.Serializable;

/**
 * Created by LijiaCheng on 2019/4/18.
 */

public class XiTu_L implements Serializable{
    public String title;
    public boolean isChecked;

    public XiTu_L(String title, boolean isChecked) {
        this.title = title;
        this.isChecked = isChecked;
    }
}
