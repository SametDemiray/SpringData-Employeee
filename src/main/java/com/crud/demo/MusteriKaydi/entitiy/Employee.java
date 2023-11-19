package com.crud.demo.MusteriKaydi.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "Employee")
@AllArgsConstructor
@NoArgsConstructor

public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = true, name = "name")
    private String name;

    @Column(nullable = true, name = "surname")
    private String surname;

    @Column(nullable = true, name = "email")
    private String email;

    @Column(name = "salary")
    private Double salary;

    @Column(name="tckn")
    private String tckn;
}
