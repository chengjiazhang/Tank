package com.tank.mybatis.test;

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
 * @Date: 2019-11-06 15:23
 * @Description:
 */
public class LoginTest {


    private InputStream in;
    private SqlSession sqlSession;
    private LoginNameMapper loginNameMapper;

    @Before//用于测试之前
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        loginNameMapper = sqlSession.getMapper(LoginNameMapper.class);
    }

    @After//用于测试之后
    public void destroy() throws IOException {
        //6.提交事务
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testSaveUser() {
        LoginUser user = new LoginUser();
        user.setLoginName("zhang");
        user.setPassword("123456");
        System.out.println(user);
        loginNameMapper.registerUser(user);
        System.out.println(user);
    }


    @Test
    public void testFindAllByName() {
        List<LoginUser> users = loginNameMapper.findAllByName("%李%");
        for (LoginUser user : users
        ) {
            System.out.println(user);
        }
    }
}



