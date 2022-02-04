package com.example.service;

import java.util.List;

import com.example.entity.Teacher;

public interface ITeacherService {

	public boolean saveTeacher(Teacher teacher);
	public List<Teacher> getTeacherBasedonSubject(String suject);
}
