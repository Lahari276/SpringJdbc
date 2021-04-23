package basic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.dao.StudentDao;
import basic.model.Student;

@Service("studentDaoHelper")
public class StudentDaoHelper {
	@Autowired
	StudentDao studentDaoImpl;

	void insertStudents(){
		Student s1 = new Student(1, "lahari", 1, 11);
		Student s2 = new Student(2, "srujan", 2, 22);
		Student s3 = new Student(3, "priya", 3, 33);
		Student s4 = new Student(4, "hyma", 4, 44);
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		studentDaoImpl.insert(students);
		System.out.println("batch updated complete..");

	}

}