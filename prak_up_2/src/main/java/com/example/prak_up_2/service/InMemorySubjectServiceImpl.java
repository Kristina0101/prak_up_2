package com.example.prak_up_2.service;

import com.example.prak_up_2.model.SubjectModel;
import com.example.prak_up_2.repository.InMemorySubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemorySubjectServiceImpl extends SubjectService{
    private final InMemorySubjectRepository subjectRepository;

    public InMemorySubjectServiceImpl(InMemorySubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<SubjectModel> findAllSubjects() {
        return subjectRepository.findAllSubjects();
    }

    @Override
    public SubjectModel findSubjectById(int id) {
        return subjectRepository.findSubjectById(id);
    }

    @Override
    public SubjectModel addSubject(SubjectModel subject) {
        return subjectRepository.addSubject(subject);
    }

    @Override
    public SubjectModel updateSubject(SubjectModel subject) {
        return subjectRepository.updateSubject(subject);
    }

    @Override
    public void deleteSubject(int id) {
        subjectRepository.deleteSubject(id);
    }
}
