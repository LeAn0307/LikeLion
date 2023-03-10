package com.example.LikeLion.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDto {
    private Long employeeId;

    @NotEmpty(message = "Khong duoc rong name nha :>")
    @Length(min = 10, max=50)
    private String name;
    private Date birthDate;
    private String gender;

    @NotEmpty(message = "Khong duoc rong email nha :>")
    @Email(message = "Email chua dung dinh dang")
    private String email;
}
