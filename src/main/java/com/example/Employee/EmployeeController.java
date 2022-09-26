package com.example.Employee;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @RequestMapping(value = "/getAllEmployee",method = RequestMethod.GET)
    public List<EmployeeEntity> getAllEmployee(){

        return employeeService.getAllEmployee();
    }
     @RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
    public EmployeeEntity insertEmployee(@RequestBody EmployeeEntity employeeEntity){

      logger.info("Inside the insert employee method");

         return employeeService.insertEmployee(employeeEntity);
     }


}
