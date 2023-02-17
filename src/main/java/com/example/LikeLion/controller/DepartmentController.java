package com.example.LikeLion.controller;

import com.example.LikeLion.dto.DepartmentDto;
import com.example.LikeLion.service.DepartmentDtoService;
import com.example.LikeLion.service.impl.DepartmentDtoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("likelion/department")

public class DepartmentController {
    @Autowired
    private DepartmentDtoService departmentDtoService;

    @PostMapping("/get")
    public DepartmentDto getDepartments(@RequestBody @Valid DepartmentDto departmentDto) {
        return departmentDtoService.getDepartmentDto(departmentDto);
    }

}
