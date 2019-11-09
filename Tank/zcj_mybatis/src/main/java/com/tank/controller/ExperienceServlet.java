package com.tank.controller;

import com.tank.domain.DO.Experience;
import com.tank.mapper.IExperienceDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author edz
 */

public class ExperienceServlet extends HttpServlet {
    private InputStream in;
    private SqlSession sqlSession;
    private IExperienceDao experienceDao;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        experienceDao = sqlSession.getMapper(IExperienceDao.class);

//将前台数据封装到Experience
        Experience experience = new Experience();
        experience.setProject_name(req.getParameter("item_name"));
        experience.setProject_url(req.getParameter("link_name"));
        experience.setBegin_time(req.getParameter("begin_time"));
        experience.setEnd_time(req.getParameter("end_time"));
        experience.setProject_describe(req.getParameter("desc"));
        experience.setAchievement(req.getParameter("achi"));
        HttpSession session = req.getSession();
        experience.setUser_id((Integer) req.getSession().getAttribute("id"));

        experienceDao.saveExperience(experience);
        destroys();
        resp.sendRedirect("jsp/main.jsp");

    }

    public void destroys() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
}
