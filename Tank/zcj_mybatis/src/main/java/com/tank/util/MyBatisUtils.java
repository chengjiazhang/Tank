package com.tank.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhangbenchao
 * @date 2019-10-31 10:39
 * 文件描述：
 */
public class MyBatisUtils {
    private static SqlSession sqlSession;
    private static InputStream inputStream;

    /**
     * 获取sqlSession对象
     * @throws IOException
     */
    public static SqlSession init() throws IOException {
        inputStream = Resources.getResourceAsStream("mybatis.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        //3.使用工厂创建SqlSession
        sqlSession = factory.openSession();
        return sqlSession;
    }

    /**
     * 提交事务，关闭资源
     * @throws IOException
     */
    public static void destory() throws IOException {
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
        inputStream.close();
    }
}
