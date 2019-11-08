package com.hb.entity;

public class TpaperSt {
     private  String title;
     private String type;
     private  String paperSummary;
     private String paperContext;
     private String createdBy;
     private String creationDate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaperSummary() {
        return paperSummary;
    }

    public void setPaperSummary(String paperSummary) {
        this.paperSummary = paperSummary;
    }

    public String getPaperContext() {
        return paperContext;
    }

    public void setPaperContext(String paperContext) {
        this.paperContext = paperContext;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }
}
