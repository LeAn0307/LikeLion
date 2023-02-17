package com.example.LikeLion.service.impl;

import com.example.LikeLion.dto.EmployeeDto;
import com.example.LikeLion.service.EmployeeDtoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class EmployeeDtoServiceImpl implements EmployeeDtoService {

    private Logger logger = LoggerFactory.getLogger(EmployeeDtoServiceImpl.class);
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {

        logger.info(employeeDto.toString());
        return employeeDto;
    }

}
