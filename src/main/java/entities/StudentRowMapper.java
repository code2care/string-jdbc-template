package entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet resultSet, int noOfRows) throws SQLException {

		Student student = new Student();
		student.setStudentId(resultSet.getInt("student_id"));
		student.setStudentName(resultSet.getString("student_name"));
		return student;
	}
}
