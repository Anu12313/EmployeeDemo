package com.example.Employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class EmployeeEntity {
    @Id
    private Integer id;
    private String name;
    private String emailId;


    public EmployeeEntity(Integer id, String name, String emailId) {
    }
}
