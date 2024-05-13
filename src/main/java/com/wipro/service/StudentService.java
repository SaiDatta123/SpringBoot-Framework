package com.wipro.service;

import com.wipro.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void saveStudent(Student student);

    Student getStudentById(int id);

    void updateStudent(Student student);

    void deleteStudentById(int id);

}
