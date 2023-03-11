package com.example.em.repo;

import com.example.em.entity.Employee;
import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    

}
