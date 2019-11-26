package com.banyuan.pangu.tank.domain;

import lombok.Data;

/**
 * @author: ZCJ
 * @Date: 2019-11-24 14:27
 * @Description:
 */
@Data
public class WorkExperienceDO {
private Integer id;
private String company;
private String isVisible;
private String department;
private String position;
private String hireTime;
private String leaveTime;
private String workContent;
private Integer userId;
private Integer deleteStatus;
}
