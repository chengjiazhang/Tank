package com.tank.controller;

import com.tank.util.Conn.ConnData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author: ZCJ
 * @Date: 2019-11-06 14:18
 * @Description:
 */
@WebServlet("/experience")
public class WorkExperienceServlet extends HttpServlet {
    Integer isVisible;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("lllllll");
        try {
            insertData(req, res);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("index.jsp").forward(req, res);
    }

    protected void insertData(HttpServletRequest req, HttpServletResponse res) throws IOException, ParseException {
        req.setCharacterEncoding("UTF-8");//传值编码
        res.setContentType("text/html;charset=UTF-8");//
        String company = req.getParameter("company");
        String isVisibleNum = req.getParameter("isVisible");
        System.out.println(isVisible + "===isvisible");
        if (isVisibleNum != null) {
            isVisible = Integer.valueOf(isVisibleNum);
        } else {
            isVisible = 0;
        }
        String department = req.getParameter("department");
        String position = req.getParameter("position");
        String hireDate = req.getParameter("hireDate");
        String leaveDate = req.getParameter("leaveDate");
        String workContent = req.getParameter("workContent");
        HttpSession session = req.getSession();
        Integer id = (Integer) session.getAttribute("id");
        System.out.println("work" + id);
        System.out.println(company + "\n" + workContent);
        ConnData conn = new ConnData();
        conn.init();
        conn.Save(company, isVisible, department, position, hireDate, leaveDate, workContent, id);
        conn.destroy();
    }
}
