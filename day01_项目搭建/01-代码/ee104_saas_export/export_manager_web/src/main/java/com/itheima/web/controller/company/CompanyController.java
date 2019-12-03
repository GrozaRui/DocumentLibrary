package com.itheima.web.controller.company;


import com.itheima.domain.company.Company;
import com.itheima.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    //方法
    @RequestMapping("/list")
    //springmvc支持 2018/01/01  不支持- saas项目中用的都是-
    public String list(HttpServletRequest request , Date myDate){
        //int i = 1/0;
        //System.err.println(myDate);
        //调用service查询
        List<Company> companyList = companyService.findAll();
        //System.out.println(companyList);
        request.setAttribute("list" , companyList);
        return "company/company-list";
    }
}
