package com.tank.mapper;


import com.tank.domain.DO.Experience;

/**
 * @author edz
 */
public interface IExperienceDao {
    /**
     * 增加并保存用户
     */
    void saveExperience(Experience experience);

}
