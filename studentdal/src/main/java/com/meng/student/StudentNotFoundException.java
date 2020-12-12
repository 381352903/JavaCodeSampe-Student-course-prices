package com.meng.student;

public class StudentNotFoundException extends RuntimeException{
    StudentNotFoundException(Long id){
        super("Could not find the id:"+id);
    }
}
