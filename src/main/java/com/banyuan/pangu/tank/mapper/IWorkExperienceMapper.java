package com.banyuan.pangu.tank.mapper;
import com.banyuan.pangu.tank.domain.WorkExperienceDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: ZCJ
 * @Date: 2019-11-24 11:28
 * @Description:
 */
@Mapper
public interface IWorkExperienceMapper {

    List<WorkExperienceDO> findAll();

    void saveWorkExperience(WorkExperienceDO workExperienceDO);

}
