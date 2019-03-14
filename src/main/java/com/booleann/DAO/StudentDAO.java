package com.booleann.DAO;

import com.booleann.Entity.Student;

import java.util.Collection;

public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void uptudateStudent(Student student);

    void insertStudent(Student student);
}
