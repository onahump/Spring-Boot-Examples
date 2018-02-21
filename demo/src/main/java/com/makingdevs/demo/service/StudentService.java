package com.makingdevs.demo.service;

import com.makingdevs.demo.dao.StudentDao;
import com.makingdevs.demo.model.Student;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentDao studentDao;

	@Autowired
	public StudentService(@Qualifier("fakeDao") StudentDao studentDao){
		this.studentDao = studentDao;
	}

	public int persitNewStudent(UUID studentId, Student student){
		UUID studentId = studentId == null ? UUID.randomUUID() : studentId;
		return studentDao.insertNewStudent(studentId, student);
	}

	public Student getStudentById(UUID studentId){
		return studentDao.selectStudentById(studentId);
	}

	public List<Student> getAllStudents(){
		return studentDao.selectAllStudents();
	}

	public int updateStudentById(UUID studentId, Student studentUpdate){
		return studentDao.updateStudentById(studentId, studentUpdate);
	}

	public int deleteStudentById(UUID studentId){
		return studentDao.deleteStudentById(studentId);
	}

}