import config.AppConfig;
import dao.StudentDao;
import entities.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcTemplateExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao studentDao = context.getBean(StudentDao.class);
		Student student = studentDao.getStudentById(1);
		System.out.println(student);
		context.close();
	}
}
