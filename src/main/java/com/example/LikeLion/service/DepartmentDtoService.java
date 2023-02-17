package com.example.LikeLion.service;


import com.example.LikeLion.dto.DepartmentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentDtoService {
    DepartmentDto getDepartmentDto(DepartmentDto departmentDto);
}
