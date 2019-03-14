package com.booleann.DAO;

import com.booleann.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongolDate")
public class MongolStudentDaoImpl implements StudentDAO {

//    Connection mongoconnection;

    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1,"Waldek","buba"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void uptudateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
