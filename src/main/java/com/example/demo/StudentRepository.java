package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Student findByIdAndName(Long id, String name);

    //public Student setId(Long studentId);
}
