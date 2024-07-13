package model.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	//auto_increment
	private long id;
	
	@Column(name = "first_name",nullable = false, length = 150)
	private String fname;
	@Column(name = "last_name", nullable = false, length = 150)
	private String lname;
	
	public Student(long id, String fn, String ln) {
		this.id = id;
		this.fname = fn;
		this.lname = ln;
	}
	
	public Student() {
		
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String toString() {
		return "Student ID  :  "+ getId()+"\nFirst Name  :  "+getFname()+"\nLast Name  :  "+getLname();
		
	}
}
