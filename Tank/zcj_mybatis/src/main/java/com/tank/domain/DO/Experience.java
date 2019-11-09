package com.tank.domain.DO;

import java.util.Date;

/**
 * @author edz
 */
public class Experience {
    private int id;
    private Date gmt_create;
    private Date gmt_modified;
    private String project_name;
    private String project_url;
    private String begin_time;
    private String  end_time;
    private int user_id;
    private int delete_status;
    private String project_describe;
    private String achievement;

    public Experience() {
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", project_name='" + project_name + '\'' +
                ", project_url='" + project_url + '\'' +
                ", begin_time='" + begin_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", user_id=" + user_id +
                ", delete_status=" + delete_status +
                ", project_describe='" + project_describe + '\'' +
                ", achievement='" + achievement + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_url() {
        return project_url;
    }

    public void setProject_url(String project_url) {
        this.project_url = project_url;
    }

    public String getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(String begin_time) {
        this.begin_time = begin_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(int delete_status) {
        this.delete_status = delete_status;
    }

    public String getProject_describe() {
        return project_describe;
    }

    public void setProject_describe(String project_describe) {
        this.project_describe = project_describe;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }
}

