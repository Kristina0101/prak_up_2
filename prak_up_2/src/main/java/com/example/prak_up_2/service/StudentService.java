package com.example.prak_up_2.service;

import com.example.prak_up_2.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public abstract class StudentService {

    private List<StudentModel> students = new ArrayList<>();

    public List<StudentModel> findAllStudent() {
        return new ArrayList<>(students);
    }

    public abstract StudentModel findStudentById(int id);

    public StudentModel addStudent(StudentModel student) {
        students.add(student);
        return student;
    }

    public StudentModel updateStudent(StudentModel updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == updatedStudent.getId()) {
                students.set(i, updatedStudent);
                break;
            }
        }
        return updatedStudent;
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
