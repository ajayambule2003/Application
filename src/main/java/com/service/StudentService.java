package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.dao.StudentDAO;

@Service
public class StudentService {
	private StudentDAO studentDao;

	private void addStudent(Student student) {
		studentDao.insertStudent(student);
	}

	private void deleteStudent(int id) {
		studentDao.removeStudent(id);
	}

	public void modifyStudent(Student student) {
		studentDao.updateStudent(student);
	}

	public List<Student> findAllStudent() {
		return studentDao.getAllStudets();
	}

	public StudentDAO getStudentDao() {
		return studentDao;
	}

	@Autowired
	public void setStudentDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
}
