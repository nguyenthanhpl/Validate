package com.example.validate.Model;

import lombok.Data;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.DateTimeFormat;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class Student {
    @NotNull("LastName can not be null!!")
    private String name;
    @NotNull("Choose the subject count you are going to study!")
    @Min(value = 4, message = "Student should enroll to minimum 4 subjects!!")
    @Max(value = 8, message = "Student can enroll to maximum 8 subjects!!")
    private int subjectCount;
    @NotNull
    @Min(1)
    @Max(12)
    private int grade;
    @NotNull
    @Size(max = 10, min = 10, message = "Mobile number should be of 10 digits")
    @Pattern("[7-9][0-9]{9}")
    private String mobileNo;
    @NotNull("Please enter birth date")
    @Past(message = "Birth date should be less than current date!!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;
}
