package com.example.studentmanagement.Controller;
 
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
import com.example.studentmanagement.Service.SubjectService;
 
@Controller
@RequestMapping("/Subject")
public class SubjectController {
@Autowired
  private SubjectService service;
 
    @GetMapping("/addSubject")
    public String add(Model model) {
     List<Course> listcourse = service.listAll();
        model.addAttribute("listcourse", listcourse);
        model.addAttribute("course", new Subject());
        return "addSubject";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCourse(@ModelAttribute("Subject") Subject course) {
        service.save(Subject);
        return "redirect:/Subject";
    }
 
    @RequestMapping("/edit/{Name}")
    public ModelAndView showEditCoursePage(@PathVariable(name = "Name") int Name) {
        ModelAndView mav = new ModelAndView("addSubject");
        Course course = service.get(Name);
        mav.addObject("Subject", Subject);
        return mav;
        
    }
    @RequestMapping("/delete/{Nmae}")
    public String deleteCoursePage(@PathVariable(name = "Name") int Name) {
        service.delete(Name);
        return "redirect:/Subject";
    }
}