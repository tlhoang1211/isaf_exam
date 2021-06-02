package com.example.iasf_exam.controller;

import com.example.iasf_exam.entity.Employee;
import com.example.iasf_exam.model.EmployeeDTO;
import com.example.iasf_exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping()
    public EmployeeDTO create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping()
    public List<EmployeeDTO> findAll (){
        return employeeService.findAll();
    }
}
