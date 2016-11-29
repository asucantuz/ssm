package com.szkingdom.ssm.entity;

import java.util.Date;

public class Blog {
    private Long id;

    private String title;

    private String content;

    private Date createdtime;

    public Blog(Long id, String title, String content, Date createdtime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdtime = createdtime;
    }

    public Blog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }
}