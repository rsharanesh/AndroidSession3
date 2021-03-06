package com.example.android.androidsession3;

public class MemesClass {
    String id;
    String name;
    String url;
    Integer width;
    Integer height;
    Integer box_count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getBoxCount() {
        return box_count;
    }

    public void setBoxCount(Integer boxCount) {
        this.box_count = boxCount;
    }

    public MemesClass(String id, String name, String url, Integer width, Integer height, Integer boxCount) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.width = width;
        this.height = height;
        this.box_count = boxCount;
    }
}