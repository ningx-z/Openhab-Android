package org.openhab.habdroid.model;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * @Author： zy
 * @Date： 2020/6/20 4:40 PM
 * @Description：
 */
public class LiteItems extends LitePalSupport {

    @Column(unique = true)
    private String id;

    private String category;

    private String label;

    private String link;

    private String name;

    private String period;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
