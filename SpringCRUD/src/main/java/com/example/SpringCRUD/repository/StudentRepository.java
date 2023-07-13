package com.example.SpringCRUD.repository;

import com.example.SpringCRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(value = "SELECT * FROM students", nativeQuery = true)
    public List<Student> getAllStudents();
}
