package com.wipro.service.impl;

import com.wipro.model.Student;
import com.wipro.repository.StudentRepository;
import com.wipro.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        log.info("Retrieving all Students");
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        log.info("Adding a new Student into Repository : {}" ,student);
        studentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(new Student());
    }

    @Override
    public void updateStudent(Student student) {
        log.info("Updating Student in repository : {}" , student);
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        log.info("Id received for deleting : {}" , id );
        studentRepository.deleteById(id);

    }
}
