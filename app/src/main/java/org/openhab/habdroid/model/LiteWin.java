package org.openhab.habdroid.model;

import org.litepal.crud.LitePalSupport;

/**
 * @Author： zy
 * @Date： 2020/6/20 5:52 PM
 * @Description：
 */
public class LiteWin extends LitePalSupport {

    private String status;

    private String time;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
