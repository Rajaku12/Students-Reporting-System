package com.example.studentReporting.Domain;
 
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="subject")
public class subject
{
@English
@Maths
@Science
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long English;
private String subjectname;
private int duration;
 
public Long getName() {
return English;
}
 
public void setName(String Name) {
this.Name = Name;
}
 
public String getEnglish(String English) {
this.English = English;
}
public String getMaths(String Maths) {
this.Maths = Maths;
}
public String getScience(String Maths) {
this.Science = Science;
}
 
public void setCoursename(String coursename) {
this.coursename = coursename;
}
 
public int getDuration() {
return duration;
}
 
public void setDuration(int duration) {
this.duration = duration;
}
}