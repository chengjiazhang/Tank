package com.tank.mapper;

import com.tank.domain.DO.WorkExperience;

import java.util.List;

/**
 * @author: ZCJ
 * @Date: 2019-11-06 11:28
 * @Description:
 */
public interface WorkExperienceMapper {

    List<WorkExperience> findAll();

    void saveWorkExperience(WorkExperience workExperience);


}
