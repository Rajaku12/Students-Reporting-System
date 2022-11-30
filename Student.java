package com.example.studentmanagement.Domain;
 
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
@Table(name="student")
public class Student {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String stname;
private int fee;
 
public Long getEnglish() {
return English;
}
 
public void setEnglish(String English) {
this.English = English;
}
 
public String getStMaths() {
return stMaths;
}
 
public void setStMaths(String stmaths) {
this.stmaths = stmaths;
}
public String getStScience() {
return stScience;
}
 
public void setStScience(String stScience) {
this.stScience = stScience;
}
 
public int getFee() {
return fee;
}
 
public void setFee(int fee) {
this.fee = fee;
}
 
 
}