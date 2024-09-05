package com.example.prak_up_2.controller;

import com.example.prak_up_2.model.StudentModel;
import com.example.prak_up_2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAllStudent());
        return "studentList"; // должно соответствовать имени файла HTML
    }


    @GetMapping("/subjectsPage")
    public String subject() {
        return "subjects";
    }

    @GetMapping("/bookPage")
    public String book() {
        return "bookList";
    }

    @PostMapping("/students/add")
    public String addStudent(@RequestParam String name,
                             @RequestParam String lastName,
                             @RequestParam String firstName,
                             @RequestParam String middleName) {
        StudentModel newStudent = new StudentModel(0, name, lastName, firstName, middleName);
        studentService.addStudent(newStudent);
        return "redirect:/students";
    }

    @PostMapping("/students/update")
    public String updateStudent(@RequestParam int id,
                                @RequestParam String name,
                                @RequestParam String lastName,
                                @RequestParam String firstName,
                                @RequestParam String middleName) {
        StudentModel updatedStudent = new StudentModel(id, name, lastName, firstName, middleName);
        studentService.updateStudent(updatedStudent);
        return "redirect:/students";
    }

    @PostMapping("/students/delete")
    public String deleteStudent(@RequestParam int id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }

}
