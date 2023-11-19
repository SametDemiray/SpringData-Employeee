package com.crud.demo.MusteriKaydi.controller;

import com.crud.demo.MusteriKaydi.entitiy.Employee;
import com.crud.demo.MusteriKaydi.repository.EmployeeRepository;
import com.crud.demo.MusteriKaydi.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public void save(@RequestBody Employee employee) throws Exception {

        employeeService.save(employee);
    }

    @GetMapping("/byId/{id}")
    Employee getUser(@PathVariable long id) {
        // bir tane tckn geliyor postmanden veya browserdan
        // ÖR: http://localhost:8080/api/employee/byId/5566782342
        // Sonucunda da 1 tane Employee doner
        return employeeService.getById(id);
    }

}
