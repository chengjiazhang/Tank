package com.tank.mapper;

import com.tank.domain.DO.EducationDO;

/**
 * @author zhangbenchao
 * @date 2019-11-06 13:13
 * 文件描述：
 */
public interface EducationMapper {

    /**
     * 保存操作
     * @param educationDO
     * @return
     */
    int insertEducation(EducationDO educationDO);
}
