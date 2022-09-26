package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<EmployeeEntity>getAllEmployee(){

        List<EmployeeEntity> list  = new ArrayList<>();
       list= employeeRepository.findAll();
        return list;
    }
    public EmployeeEntity insertEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }
}
