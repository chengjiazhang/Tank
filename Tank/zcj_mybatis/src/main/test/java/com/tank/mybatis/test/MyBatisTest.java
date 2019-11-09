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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * @author: ZCJ
 * @Date: 2019-11-06 13:02
 * @Description:
 */
public class MyBatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private WorkExperienceMapper workExperienceMapper;
    @Before//用于测试之前
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
    @After//用于测试之后
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
    @Test
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
    @Test
    public void testSave() throws IOException, ParseException {
        WorkExperience workExperience=new WorkExperience();
        workExperience.setCompany("tengxun");
            workExperience.setDepartment("机械");
            workExperience.setPosition("工程师");
            //SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
            String str="2019-12-12";
            //Date date1=date.parse(str);
        //System.out.println(date1);
            workExperience.setHireDate(str);
            workExperience.setLeaveDate(str);
            workExperience.setWorkContent("Hello World");
        System.out.println("之前=="+workExperience);
        workExperienceMapper.saveWorkExperience(workExperience);

                 //6.提交事务
//        sqlSession.commit();
        System.out.println("之后----"+ workExperience);
    }

}
