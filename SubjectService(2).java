package com.example.studentReporting.Service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.studentmanagement.Domain.Student;
import com.example.studentmanagement.Repository.StudentRepository;
 
@Service
public class StudentService {
 
@Autowired
    private StudentRepository repo;
public List<Student> listAll()
{
System.out.println(repo.findAll());
        return repo.findAll();
    }
    
 
    public void save(Student std) {
        repo.save(std);
    }
    
    public Student get(String English) {
        return repo.findByEngliah(English).get();
    }
    
    public void delete(English) {
        repo.deleteByEnglish(English);
    }

    public Student get(String Maths) {
        return repo.findByMaths(Maths).get();
    }
    
    public void delete(Maths) {
        repo.deleteByScience(Maths);
    }

    public Student get(String Science) {
        return repo.findByScience(Science).get();
    }
    
    public void delete(Science) {
        repo.deleteByEnglish(Science);
    }
 
}