package com.meng.student.dal.repos;

import com.meng.student.dal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long>{

}
