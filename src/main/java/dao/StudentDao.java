package dao;

import entities.Student;

public interface StudentDao {
	Student getStudentById(int studentId);
}