package com.itheima.service.company.impl;

import com.itheima.dao.company.CompanyDao;
import com.itheima.domain.company.Company;
import com.itheima.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;
    @Override
    public List<Company> findAll() {
        List<Company> companyList = companyDao.findAll();
/*        for (Company company : companyList) {
            System.out.println(company);
        }*/
        return companyList;
    }
}
