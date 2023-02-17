package com.example.LikeLion.controller;

import com.example.LikeLion.dto.EmployeeDto;
import com.example.LikeLion.service.impl.EmployeeDtoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("likelion/employee")
public class EmployeeController {

    @Autowired
    private EmployeeDtoServiceImpl employeeDtoService;

    @PostMapping("/get")
    public EmployeeDto getEmployees(@RequestBody @Valid EmployeeDto employeeDto) {
        return employeeDtoService.getEmployeeDto(employeeDto);
    }
}
