package com.example.iasf_exam.service;

import com.example.iasf_exam.entity.Employee;
import com.example.iasf_exam.model.EmployeeDTO;
import com.example.iasf_exam.model.Mapper;
import com.example.iasf_exam.repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    @Autowired
    private EmployeeJpaRepository employeeJpaRepository;

    public EmployeeDTO save (Employee employee) {
        employeeJpaRepository.save(employee);
        return Mapper.employeeDTO(employee);
    }

    public List<EmployeeDTO> findAll () {
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        List<Employee> employeeList = employeeJpaRepository.findAll();
        for (Employee data : employeeList) {
            employeeDTOList.add(Mapper.employeeDTO(data));
        }
        return employeeDTOList;
    }
}
