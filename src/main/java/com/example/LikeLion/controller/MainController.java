package com.example.LikeLion.controller;

import com.example.LikeLion.dto.DepartmentDto;
import com.example.LikeLion.dto.EmployeeDto;
import com.example.LikeLion.service.EmployeeDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping ("likelion")
public class MainController {

    @Autowired
    private EmployeeDtoService employeeDtoService;

    public EmployeeDto getEmployees(@RequestBody @Valid EmployeeDto employeeDto) {
        return employeeDtoService.getEmployeeDto(employeeDto);
    }

    public DepartmentDto getDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto) {
        return null;
    }
}
