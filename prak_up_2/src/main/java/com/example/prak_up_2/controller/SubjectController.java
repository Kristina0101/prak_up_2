package com.example.prak_up_2.controller;

import com.example.prak_up_2.model.SubjectModel;
import com.example.prak_up_2.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public String getAllSubjects(Model model) {
        model.addAttribute("subjects", subjectService.findAllSubjects());
        return "subjects";
    }

    @PostMapping("/subjects/add")
    public String addSubject(@RequestParam String name,
                             @RequestParam int hourInTems,
                             @RequestParam String nameTeacher,
                             @RequestParam String surnameTeacher,
                             @RequestParam String middleNameTeacher) {
        SubjectModel newSubject = new SubjectModel(0, name, hourInTems, nameTeacher, surnameTeacher, middleNameTeacher);
        subjectService.addSubject(newSubject);
        return "redirect:/subjects";
    }


    @PostMapping("/subjects/update")
    public String updateSubject(@RequestParam int id,
                                @RequestParam String name,
                                @RequestParam int hourInTems,
                                @RequestParam String nameTeacher,
                                @RequestParam String surnameTeacher,
                                @RequestParam String middleNameTeacher) {
        SubjectModel updatedSubject = new SubjectModel(id, name, hourInTems, nameTeacher, surnameTeacher, middleNameTeacher);
        subjectService.updateSubject(updatedSubject);
        return "redirect:/subjects";
    }

    @PostMapping("/subjects/delete")
    public String deleteSubject(@RequestParam int id) {
        subjectService.deleteSubject(id);
        return "redirect:/subjects";
    }
}
