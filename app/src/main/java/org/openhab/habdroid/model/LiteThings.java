package org.openhab.habdroid.model;

import org.litepal.crud.LitePalSupport;

/**
 * @Author： zy
 * @Date： 2020/6/20 4:19 PM
 * @Description：
 */
public class LiteThings extends LitePalSupport {

    private String thingsId;

    private String link;

    private String title;

    private String parentId;

    private String period;

    public String getThingsId() {
        return thingsId;
    }

    public void setThingsId(String thingsId) {
        this.thingsId = thingsId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

}
