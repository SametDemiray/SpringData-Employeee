package com.crud.demo.MusteriKaydi.repository;

import com.crud.demo.MusteriKaydi.entitiy.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
