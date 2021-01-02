package com.chatRobot.model;

/**
 * @author 空字符-null
 * @version 1.0
 * @Time 2019-07-27 22:54
 */
public class indexImage {
    private int id;
    private String url;
    private String type;

    @Override
    public String toString() {
        return "indexImage{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
