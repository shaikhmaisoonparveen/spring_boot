package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaolmpl;
import com.tns.entities.Student;

public class StudentServicelmpl implements StudentService {
	
	
	private StudentDao dao;
	public StudentServicelmpl()
	 {
	dao = new StudentDaolmpl();
	}
	
	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}
	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id);
		return student;
		
	}
}
