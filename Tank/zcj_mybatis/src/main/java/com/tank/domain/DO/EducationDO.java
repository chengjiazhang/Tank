package com.tank.domain.DO;

import java.util.Date;

/**
 * @author zhangbenchao
 * @date 2019-11-06 13:10
 * 文件描述：
 */
public class EducationDO {
    private Integer id;
    private Date gmtCreate;
    private Date gmtModified;
    private String schoolName;
    private String schoolBegin;
    private String schoolEnd;
    private String graduate;
    private String major;
    private Integer userId;
    private Integer delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolBegin() {
        return schoolBegin;
    }

    public void setSchoolBegin(String schoolBegin) {
        this.schoolBegin = schoolBegin;
    }

    public String getSchoolEnd() {
        return schoolEnd;
    }

    public void setSchoolEnd(String schoolEnd) {
        this.schoolEnd = schoolEnd;
    }

    public String getGraduate() {
        return graduate;
    }

    public void setGraduate(String graduate) {
        this.graduate = graduate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    @Override
    public String toString() {
        return "EducationDO{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", schoolName='" + schoolName + '\'' +
                ", schoolBegin='" + schoolBegin + '\'' +
                ", schoolEnd='" + schoolEnd + '\'' +
                ", graduate='" + graduate + '\'' +
                ", major='" + major + '\'' +
                ", userId=" + userId +
                ", delete=" + delete +
                '}';
    }
}
