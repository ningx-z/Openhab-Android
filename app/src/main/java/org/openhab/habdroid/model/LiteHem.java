package org.openhab.habdroid.model;

import org.litepal.crud.LitePalSupport;

/**
 * @Author： zy
 * @Date： 2020/6/20 5:52 PM
 * @Description：
 */
public class LiteHem extends LitePalSupport {

    private String hum;

    private String time;

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
