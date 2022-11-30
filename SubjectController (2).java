package com.example.studentReporting.Controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.Student;
import com.example.studentmanagement.Service.CourseService;
import com.example.studentmanagement.Service.StudentService;
 
@Controller
@RequestMapping("/Student")
 
public class StudentController {
@Autowired
    private StudentService service;
@Autowired
private CourseService services;
 
    @GetMapping("/addstudent")
    public String add(Model model) {
     List<Student> liststudent = service.listAll();
     List<Course> listcourse = services.listAll();
    model.addAttribute("listcourse", listcourse);
        model.addAttribute("liststudent", liststudent);
        model.addAttribute("student", new Student());
        return "addstudent";
    }
    
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std)
    {
        service.save(std);
        return "redirect:/student";
    }
    
 
    @RequestMapping("/edit/{English}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "English") int English) {
        ModelAndView mav = new ModelAndView("addstudent");
        List<Course> listcourse = services.listAll();
        Student std = service.get(English);
        mav.addObject("student", std);
        return mav;
        
    }
        @RequestMapping("/edit/{Maths}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "Maths") int Maths) {
        ModelAndView mav = new ModelAndView("addstudent");
        List<Course> listcourse = services.listAll();
        Student std = service.get(Maths);
        mav.addObject("student", std);
        return mav;
        
    }
    
        @RequestMapping("/edit/{Science}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "Science") int Science) {
        ModelAndView mav = new ModelAndView("addstudent");
        List<Course> listcourse = services.listAll();
        Student std = service.get(Science);
        mav.addObject("student", std);
        return mav;
        
    }
    @RequestMapping("/delete/{English}")
    public String deleteStudentPage(@PathVariable(name = "English") int English) {
        service.delete(English);
        return "student";
    }
        @RequestMapping("/delete/{Maths}")
    public String deleteStudentPage(@PathVariable(name = "Maths") int Maths) {
        service.delete(Maths);
        return "student";
    }
          @RequestMapping("/delete/{Science}")
    public String deleteStudentPage(@PathVariable(name = "Science") int Science) {
        service.delete(Science);
        return "student";
    }
 
}