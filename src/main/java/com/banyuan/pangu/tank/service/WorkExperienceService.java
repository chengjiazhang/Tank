package com.banyuan.pangu.tank.service;

import com.banyuan.pangu.tank.domain.WorkExperienceDO;
import com.banyuan.pangu.tank.mapper.IWorkExperienceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: ZCJ
 * @Date: 2019-11-25 10:35
 * @Description:
 */
@Service
public class WorkExperienceService {
    @Resource
    IWorkExperienceMapper iWorkExperienceMapper;

    public void save(WorkExperienceDO workExperienceDO) {
        iWorkExperienceMapper.saveWorkExperience(workExperienceDO);
    }

}
