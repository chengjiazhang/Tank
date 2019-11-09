package com.tank.controller;

import com.tank.domain.DO.LoginUser;
import com.tank.domain.DTO.UserDTO;
import com.tank.util.Conn.ConnData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author edz
 */
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
private Integer id;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");
        Boolean flag = false;
        flag = assembleUser(userName, userPassword);
        System.out.println("u"+userName);
        System.out.println("p"+userPassword);
        if (flag) {
            HttpSession session=req.getSession();
            System.out.println(id);
            session.setAttribute("id",id);
            //System.out.println("login=="+session.getAttribute("id"));
            UserDTO userDTO=new UserDTO();
            userDTO.setUserName(userName);
            userDTO.setPassword(userPassword);
            userDTO.setAge(20);
            session.setAttribute("userDTO",userDTO);
            res.sendRedirect("jsp/work/test.jsp");
           // req.getRequestDispatcher("/jsp/work/test.jsp").forward(req, res);
            System.out.println("你好");
        } else {
            String message = "Sorry," + "请重新输入！" + "用户名：" + userName + "或密码：*****" + "输入错误！";
            req.setAttribute("message", message);
            req.getRequestDispatcher("jsp/comment/error.jsp").forward(req, res);
        }
    }

    private Boolean assembleUser(String userName, String userPassword) throws IOException {
        Boolean flag = false;
        ConnData conn=new ConnData();
        conn.initUser();
        List list=conn.testFindAllByName(userName);
        LoginUser user= (LoginUser) list.get(0);
        System.out.println("list"+list);
        if (userName.equals(user.getLoginName()) && userPassword.equals(user.getPassword())) {
            flag = true;
            System.out.println(user.getLoginName());
            System.out.println(user.getPassword());
            System.out.println(userName);
            System.out.println(userPassword);
            System.out.println("id="+user.getId());
            id=user.getId();
        }
        return flag;
    }
}
