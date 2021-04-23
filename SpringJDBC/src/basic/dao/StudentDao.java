package basic.dao;
import basic.model.Student;

public interface StudentDao {
	public void insert(Student student);
	void delRecordById(int id);
	 int delRecordByNameSem(String studentName, int sem);
	public void cleanUp();

}