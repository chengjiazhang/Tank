package com.tank.controller;

import com.tank.domain.DO.EducationDO;
import com.tank.domain.DO.LoginUser;
import com.tank.mapper.EducationMapper;
import com.tank.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @author zhangbenchao
 * @date 2019-11-06 16:39
 * 文件描述：
 */
public class EducationController extends HttpServlet {

    private SqlSession sqlSession;

    @Override
    public void init() throws ServletException {
        try {
            sqlSession = MyBatisUtils.init();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = insertEducation(req, resp);
        if (i > 0) {
            resp.sendRedirect("main.jsp");
        }
    }

    public int insertEducation(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTf-8");
        EducationDO educationDO = new EducationDO();
        Integer id = (Integer) req.getSession().getAttribute("id");
        //LoginUser loginUserDO = (LoginUser) req.getSession().getAttribute("id");
        educationDO.setSchoolName(req.getParameter("schoolName"));
        educationDO.setSchoolBegin(req.getParameter("startTime"));
        educationDO.setSchoolEnd(req.getParameter("endTime"));
        educationDO.setGraduate(req.getParameter("graduate"));
        educationDO.setMajor(req.getParameter("project"));
        educationDO.setUserId(id);

        EducationMapper educationMapper = sqlSession.getMapper(EducationMapper.class);
        int i = educationMapper.insertEducation(educationDO);
        sqlSession.commit();
        return i;
    }
}
