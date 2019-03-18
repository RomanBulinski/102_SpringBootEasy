package com.booleann.Service;

import com.booleann.DAO.FakeStudentDAOImpl;
import com.booleann.DAO.StudentDAO;
import com.booleann.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Qualifier("fakeDate")
    @Autowired
//    @Qualifier("fakeData")
    private StudentDAO studentDAO;

    public Collection<Student> getAllStudents(){
        return  this.studentDAO.getAllStudents();
    }

    public Student getStudentById(int id){
        return this.studentDAO.getStudentById(id);
    }


    public void deleteStudentById(int id) {
        this.studentDAO.removeStudentById(id);
    }

    public void uptudateStudent(Student student) {
        this.studentDAO.uptudateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDAO.insertStudent(student);
    }
}
