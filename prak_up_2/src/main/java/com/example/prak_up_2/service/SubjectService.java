package com.example.prak_up_2.service;


import com.example.prak_up_2.model.SubjectModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public abstract class SubjectService {
    private List<SubjectModel> subjects = new ArrayList<>();

    public List<SubjectModel> findAllSubjects() {
        return new ArrayList<>(subjects);
    }

    public abstract SubjectModel findSubjectById(int id);

    public SubjectModel addSubject(SubjectModel subject) {
        subjects.add(subject);
        return subject;
    }


    public SubjectModel updateSubject(SubjectModel updatedSubject) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getId() == updatedSubject.getId()) {
                subjects.set(i, updatedSubject);
                break;
            }
        }
        return updatedSubject;
    }

    public void deleteSubject(int id) {
        subjects.removeIf(subject -> subject.getId() == id);
    }
}
