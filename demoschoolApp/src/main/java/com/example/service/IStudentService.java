package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface IStudentService {

	public boolean saveStudent(Student student);
	public List<Student> getAllStudents();
	public List<Student> getStudentsBasedonMarksRange(int range1,int range2);
}
