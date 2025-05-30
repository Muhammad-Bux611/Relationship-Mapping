package com.baloch.relationshipMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	int rollNo;
	String sname;
	int marks;
	@OneToMany(mappedBy = "students")
	List<RelationshipMapping> laptop=new ArrayList<RelationshipMapping>() ;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<RelationshipMapping> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<RelationshipMapping> laptop) {
		this.laptop = laptop;
	}
	
	
	
}
