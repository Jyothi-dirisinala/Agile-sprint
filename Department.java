package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "DEPARTMENT")
public class Department {
    private String DNAME;

    @Id
    private Integer DNUMBER;
    private String MGR_SSN;
    private Date MGR_START_DATE;
}
