package com.example.LikeLion.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentDto {
    private Long departmentId;
    @NotEmpty(message = "Khong duoc rong deptName nha :>")
    private String deptName;
    @NotEmpty(message = "Khong duoc rong description nha :>")
    private String description;

    @Valid
    private List<EmployeeDto> employeeDtoList;

}


