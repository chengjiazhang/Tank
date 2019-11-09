package com.tank.domain.DO;

import java.util.Date;

/**
 * @author: ZCJ
 * @Date: 2019-11-06 11:21
 * @Description:
 */
public class WorkExperience {
    private int id;
    private Date gmtCreate;
    private Date gmtModifeid;
    private String company;
    private int isVisible;
    private String department;
    private String position;
    private String hireDate;
    private String leaveDate;
    private String workContent;
    private int deleteStatus;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModifeid() {
        return gmtModifeid;
    }

    public void setGmtModifeid(Date gmtModifeid) {
        this.gmtModifeid = gmtModifeid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(int isVisible) {
        this.isVisible = isVisible;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModifeid=" + gmtModifeid +
                ", company='" + company + '\'' +
                ", isVisible=" + isVisible +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", hireDate=" + hireDate +
                ", leaveDate=" + leaveDate +
                ", workContent='" + workContent + '\'' +
                ", deleteStatus=" + deleteStatus +
                ", userId=" + userId +
                '}';
    }
}
