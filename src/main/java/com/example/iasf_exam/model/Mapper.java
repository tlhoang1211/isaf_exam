package com.example.iasf_exam.model;

import com.example.iasf_exam.entity.Employee;

public class Mapper {
    public static EmployeeDTO employeeDTO (Employee employee) {
        EmployeeDTO data = new EmployeeDTO();
        data.setId(employee.getId());
        data.setName(employee.getName());
        data.setWage(employee.getWage());
        data.setWage(employee.getStatus());

        return data;
    }
}
