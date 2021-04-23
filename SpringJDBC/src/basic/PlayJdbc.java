package basic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;

public class PlayJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDaoHelper helper = context.getBean("studentDaoHelper",StudentDaoHelper.class);
		helper.insertStudents();
		//StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		//studentDao.delRecordById(4);
		//studentDao.delRecordById(2);
		//studentDao.cleanUp();
		//insertStudent(studentDao);
		//studentDao.delRecordByNameSem("lahari", 5);

	}
		
	private static void insertStudent(StudentDao studentDao) {
		Student myStudent = new Student(2, "lahari", 5, 70);
		Student anotherStudent = new Student(4,"hari",8,80);
		//= new StudentDaoImpl();
		studentDao.insert(anotherStudent);
		studentDao.insert(myStudent);
	}


}