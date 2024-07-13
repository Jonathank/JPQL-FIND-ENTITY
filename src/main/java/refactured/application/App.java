/**
 * 
 */
package refactured.application;

import model.student.Student;
import refactured.studentUtilities.StudentRepository;

/**
 * @author JONATHAN
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Student std = new Student();
		std.setFname("BAMUJJE");
		std.setLname("HERMAN");

		StudentRepository rep = new StudentRepository();

		rep.addStudent(std);
		System.out.println("ADDED STUDENT  : " + std.toString());
		
		rep.findfirstnames().forEach(System.out::println);
		
		rep.findlasttnames().forEach(System.out::println);

		rep.findStudent(std.getId());
		System.out.println("FOUND STUDENT  : " + std.toString());

		std.setLname("NEUTON");
		rep.updateStudent(std);
		System.out.println("UPDATED STUDENT  : " + std.toString());

		rep.deleteStudent(std);
		System.out.println("DELETED STUDENT  : " + std.toString());

		rep.close();
	}

}
