package com.example.validate.Controller;

import com.example.validate.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class StudentController {
    @GetMapping("/")
    public String getForm(Student student){
        return"index";
    }
    @PostMapping("/")
    public String submitStudentDetails(@Valid Student student, Errors errors, Model model) {
        if (null != errors && errors.getErrorCount() > 0) {
            return "index";
        } else {
            model.addAttribute("successMsg", "Details saved successfully!!");
            return "success";
        }
    }
}
