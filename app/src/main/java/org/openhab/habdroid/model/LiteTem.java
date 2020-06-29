package org.openhab.habdroid.model;

import org.litepal.crud.LitePalSupport;

/**
 * @Author： zy
 * @Date： 2020/6/20 5:52 PM
 * @Description：
 */
public class LiteTem extends LitePalSupport {

    private String tem;

    private String time;

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
