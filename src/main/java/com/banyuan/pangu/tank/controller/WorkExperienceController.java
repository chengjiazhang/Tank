package com.banyuan.pangu.tank.controller;

import com.banyuan.pangu.tank.domain.WorkExperienceDO;
import com.banyuan.pangu.tank.mapper.IWorkExperienceMapper;
import com.banyuan.pangu.tank.service.WorkExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ZCJ
 * @Date: 2019-11-24 15:05
 * @Description:
 */
@Controller
@EnableTransactionManagement
public class WorkExperienceController {
    @Resource
    private WorkExperienceService workExperienceService;
    private WorkExperienceDO workExperienceDO = new WorkExperienceDO() ;

    @RequestMapping("/experience")
    public String workExperience() {
        return "experience";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @ResponseBody

    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response) {
//        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("ajax进来");
        workExperienceDO.setIsVisible("1");
        workExperienceDO.setUserId(6);
        workExperienceDO.setDeleteStatus(3);
        workExperienceDO.setCompany(request.getParameter("company"));
        workExperienceDO.setDepartment(request.getParameter("department"));
        workExperienceDO.setPosition(request.getParameter("position"));
        workExperienceDO.setHireTime(request.getParameter("hireTime"));
        workExperienceDO.setLeaveTime(request.getParameter("leaveTime"));
        workExperienceDO.setWorkContent(request.getParameter("workContent"));
        System.out.println(workExperienceDO);
        workExperienceService.save(workExperienceDO);
        return "success";
    }

    @RequestMapping(value = "/login/ajax", method = RequestMethod.POST)
    public String login2(HttpServletRequest request, HttpServletResponse response) {
//        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("ajax进来");

        System.out.println(request.getParameter("userName"));
        System.out.println(request.getParameter("password"));
        return "success";
    }
    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
