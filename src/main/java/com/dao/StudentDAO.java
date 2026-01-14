package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mapper.StudentRowMapper;
import com.model.Student;

@Repository
public class StudentDAO {
	private JdbcTemplate jdbctemplate;

	private void insertStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "insert inti student(id,name,marks) values(?,?,?)";
		jdbctemplate.update(sql, student.getId(), student.getStudent(), student.getMarks());
	}

	private void removeStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from student where id=?";
		jdbctemplate.update(sql, id);
	}

	private void updateStudent(Student student) {
		// TODO Auto-generated method stub
		String sql = "update student set name=? , marks=? WHERE id=?";
		jdbctemplate.update(sql, student.getStudent(), student.getMarks(), student.getId());
	}

	public List<Student> getAllStudets() {
		String sql = "select * from student";
		return jdbctemplate.query(sql, new StudentRowMapper());
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id=?";
		return jdbctemplate.queryForObject(sql, new StudentRowMapper(), id);

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
}
