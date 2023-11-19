package com.crud.demo.MusteriKaydi.service;

import com.crud.demo.MusteriKaydi.entitiy.Employee;


import java.util.List;


public interface EmployeeService {

     void save(Employee employee) throws Exception;
     void delete(Employee employee);

     void update(Employee employee);
    Employee getById(long id);
    List<Employee> getAll();



    }