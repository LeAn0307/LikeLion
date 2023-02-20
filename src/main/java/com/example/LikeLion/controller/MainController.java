package com.example.LikeLion.controller;

import com.example.LikeLion.dto.DepartmentDto;
import com.example.LikeLion.dto.EmployeeDto;
import com.example.LikeLion.service.EmployeeDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping ("likelion")
public class MainController {

//    @Autowired
//    private EmployeeDtoService employeeDtoService;
    @Autowired
    private Environment env;

    @GetMapping("/sdt")
    public String getSdt() {
        String sdt = env.getProperty("mingbase.sdt");
        return "sdt: " + sdt;
    }
//    public EmployeeDto getEmployees(@RequestBody @Valid EmployeeDto employeeDto) {
//        return employeeDtoService.getEmployeeDto(employeeDto);
//    }
//
//    public DepartmentDto getDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto) {
//        return null;
//    }
}

