package com.booleann.DAO;

import com.booleann.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeDate")
public class FakeStudentDAOImpl implements StudentDAO {

    private static Map<Integer , Student> students;

    static {
        students = new HashMap<Integer,Student>(){
            {
            put(1,new Student(1,"Tom","math"));
            put(2,new Student(2,"Rom","polish"));
            put(3,new Student(3,"Tyt","IT"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){
        return  this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void uptudateStudent(Student student) {
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }


    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(),student);
    }
}
