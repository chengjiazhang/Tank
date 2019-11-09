package com.tank.util.Conn;

import com.tank.domain.DO.LoginUser;
import com.tank.domain.DO.WorkExperience;
import com.tank.mapper.LoginNameMapper;
import com.tank.mapper.WorkExperienceMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

/**
 * @author: ZCJ
 * @Date: 2019-11-06 16:42
 * @Description:
 */
public class ConnData {
    private InputStream in;
    private SqlSession sqlSession;
    private WorkExperienceMapper workExperienceMapper;
    private LoginNameMapper loginNameMapper;


   public void initUser() throws IOException {
       //1.读取配置文件
       in = Resources.getResourceAsStream("mybatis.xml");
       //2.创建SqlSessionFactory工厂
       SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
       //3.使用工厂生产SqlSession对象
       sqlSession = factory.openSession();
       //4.使用SqlSession创建Dao接口的代理对象
       loginNameMapper = sqlSession.getMapper(LoginNameMapper.class);
   }

    @Test
    public List<LoginUser> testFindAllByName(String name) {
        List<LoginUser> users = loginNameMapper.findAllByName(name);
        for (LoginUser user : users
        ) {
            System.out.println(user);
        }
        return users;
    }
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        workExperienceMapper = sqlSession.getMapper(WorkExperienceMapper.class);
    }
    public void destroy() throws IOException {
        //6.提交事务
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    /**
     * 测试查询所有
     *
     * @throws IOException
     */
    public void testFindAll() {
        //5.使用代理对象执行方法
        List<WorkExperience> work = workExperienceMapper.findAll();
        for (WorkExperience workList : work) {
            System.out.println(workList);
        }
    }
    /**
     * 测试保存操作
     */
    public void Save(String company,Integer isVisible,String department,String position,String hireDate,String leaveDate,String workContent,Integer id) throws IOException, ParseException {
        WorkExperience workExperience=new WorkExperience();
        workExperience.setCompany(company);
        workExperience.setIsVisible(isVisible);
        workExperience.setDepartment(department);
        workExperience.setPosition(position);
        workExperience.setHireDate(hireDate);
        workExperience.setLeaveDate(leaveDate);
        workExperience.setWorkContent(workContent);
        workExperience.setUserId(id);
        System.out.println("之前=="+workExperience);
        workExperienceMapper.saveWorkExperience(workExperience);
        //6.提交事务
//        sqlSession.commit();
        System.out.println("之后----"+ workExperience);
    }
}
