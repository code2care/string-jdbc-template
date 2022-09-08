package dao;

import javax.sql.DataSource;

import entities.Student;
import entities.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoImpl implements StudentDao {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public StudentDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Student getStudentById(int studentId) {
		return jdbcTemplate.queryForObject("select * from student where student_id = ?", new Object[] { studentId }, new StudentRowMapper());
	}
}
