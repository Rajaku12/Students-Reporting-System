package com.example.studentmanagement.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.studentmanagement.Domain.Subject;
import com.example.studentmanagement.Repository.SubjectRepository;
 
@Service
public class CourseSubject
{
@Autowired
    private SubjectRepository repo;
public List<Subject> listAll() {
        return repo.findAll();
    }
    
    public void save(Subject course) {
        repo.save(Subject);
    }
    
    public Course get(long English) {
        return repo.findByEnglish(English).get();
    }

    public Course get(long Maths) {
        return repo.findByMaths(Maths).get();
    }

    public Course get(long Science) {
        return repo.findByScience(Science).get();
    }
    
    
    
    public void delete(long English) {
        repo.deleteEnglish(English);
    }
 public void delete(long Math) {
        repo.deletemath(Math);
    }
 public void delete(long Science) {
        repo.deleteScience(Science);
    }
 
}