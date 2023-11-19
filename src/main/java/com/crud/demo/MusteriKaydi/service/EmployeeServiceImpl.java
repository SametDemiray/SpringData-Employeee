package com.crud.demo.MusteriKaydi.service;


import com.crud.demo.MusteriKaydi.entitiy.Employee;
import com.crud.demo.MusteriKaydi.logging.Logger;
import com.crud.demo.MusteriKaydi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;
    private List<Logger> loggers;


    @Override           // employee gerçek kaydetmem gerekn objenin tipi türü adı soyadı neyse içinde ne barındırıyorsa
    public void save(Employee employee) throws Exception {
        if (employee.getSalary() < 1500) {
            throw new Exception("Maaş Geçersizdir.");
        }else {
           employeeRepository.save(employee);
            System.out.println("Kayıt Başarılı.");
        }
    }


    @Override
    public void delete(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public Employee getById(long id) {
        Optional<Employee> employeeResult = employeeRepository.findById(id);// optional aslında get sonucu olabilir.
        Employee employee = employeeResult.get();  //Repositeryden hiç employee dönmemiş olsa bile sen sonuçu bana ver
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
