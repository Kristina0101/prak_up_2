package com.example.prak_up_2.repository;

import com.example.prak_up_2.model.SubjectModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemorySubjectRepository {
    private final List<SubjectModel> subjects = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    public SubjectModel addSubject(SubjectModel subject) {
        subject.setId(idCounter.getAndIncrement());
        subjects.add(subject);
        return subject;
    }


    public SubjectModel updateSubject(SubjectModel subject) {
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getId() == subject.getId()) {
                subjects.set(i, subject);
                return subject;
            }
        }
        return null;
    }

    public void deleteSubject(int id) {
        subjects.removeIf(subject -> subject.getId() == id);
    }

    public List<SubjectModel> findAllSubjects() {
        return new ArrayList<>(subjects);
    }

    public SubjectModel findSubjectById(int id) {
        return subjects.stream()
                .filter(subject -> subject.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
