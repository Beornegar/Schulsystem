package com.system.repositories;

import org.springframework.data.repository.CrudRepository;

import com.system.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}