package com.example.studentmanagement.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.studentmanagement.Domain.Subject;
 
@Repository
public interface CourseRepository extends JpaRepository<Subject, Long>{
 
}