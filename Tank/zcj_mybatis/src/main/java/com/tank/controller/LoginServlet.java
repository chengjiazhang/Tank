package com.tank.controller;

import com.tank.domain.DO.LoginUser;
import com.tank.domain.DTO.UserDTO;
import com.tank.util.Conn.ConnData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

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
            System.out.println("*******************");
           // String str=java.net.URLDecoder(req.getParameter("userName"),"UTF-8");
            Cookie cUserName=new Cookie("userName",java.net.URLDecoder.decode(req.getParameter("userName"),"UTF-8"));
            Cookie cPassword=new Cookie("userPassword",java.net.URLDecoder.decode(req.getParameter("userPassword"),"UTF-8"));
            cUserName.setMaxAge(50);
            cPassword.setMaxAge(50);
            res.addCookie(cUserName);
            res.addCookie(cPassword);
            Cookie cookie=null;
            Cookie cookies[]=null;
            cookies=req.getCookies();
            if(Objects.nonNull(cookies)){
                for(int i=0;i<cookies.length;i++){
                    cookie=cookies[i];
                    System.out.println("cookies.getNmae=="+cookie.getName());
                    System.out.println("cookie.getValue=="+cookie.getValue());
                    System.out.println("cookie.getmaxage=="+cookie.getMaxAge());
                }
            }


//            res.sendRedirect("jsp/work/test.jsp");
            req.getRequestDispatcher("/jsp/work/simple.jsp").forward(req, res);
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
