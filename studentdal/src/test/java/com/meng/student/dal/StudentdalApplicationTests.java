package com.meng.student.dal;

import com.meng.student.dal.entities.Student;
import com.meng.student.dal.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentdalApplicationTests {

    @Autowired
    StudentRepository studentRepository;
    @Test
    public void testCreateStudent(){
        Student student = new Student();
        student.setName("Join");
        student.setCourse("Math");
        student.setFee(1001d);

        //studentRepository.save(student);

        //Write Java code to retrieve the same records
        //retreve a record
        //select * from studenttab where id=1;
        testFindStudentById(1l);
        //retreve all records
        testFindAllStudents();

    }

    @Test
    public void testFindStudentById(Long id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent())
            System.out.println(student);
    }

    @Test
    public void testUpdateStudentById(Long id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()) {
            student.get().setFee(35d);
            student.get().setName("Alice");
            student.get().setCourse("Chinese");
        }
        studentRepository.save(student.get());
    }

    @Test
    public void testDeleteStudentById(Long id){
        studentRepository.deleteById(id);
    }

    @Test
    public void testFindAllStudents(){
        Iterable<Student> all = studentRepository.findAll();
        for(Student st:all){
            System.out.println(st.toString());
        }
    }

}
