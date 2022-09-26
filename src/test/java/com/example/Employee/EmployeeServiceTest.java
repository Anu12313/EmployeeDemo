package com.example.Employee;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


class EmployeeTest {

    @InjectMocks
    EmployeeService employeeService;

    @Mock
    EmployeeRepository employeeRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllEmployee()
    {
        List<EmployeeEntity> list = new ArrayList<EmployeeEntity>();
        EmployeeEntity empOne = new EmployeeEntity(1, "Anu", "Anu.A@abc.com");
        EmployeeEntity empTwo = new EmployeeEntity(2, "Gayatri", "Gayatri.k@abc.com");


        list.add(empOne);
        list.add(empTwo);


        when(employeeRepository.findAll()).thenReturn(list);

        //test
        List<EmployeeEntity> employeeEntity = employeeService.getAllEmployee();

        assertEquals(2, employeeEntity.size());
        verify(employeeRepository,times(1));
    }

    @Test
    public void insertEmployeeTest()
    {
        EmployeeEntity emp = new EmployeeEntity(3,"Lokesh","user@email.com");

        employeeRepository.save(emp);

        verify(employeeRepository, times(1)).save(emp);
    }
}
