package com.itheima.dao.company;

import com.itheima.domain.company.Company;

import java.util.List;

public interface CompanyDao {
    //查询所有
    public List<Company> findAll();
}
