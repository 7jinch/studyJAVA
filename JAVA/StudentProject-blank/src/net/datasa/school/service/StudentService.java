package net.datasa.school.service;

import java.util.ArrayList;
import java.util.List;

import net.datasa.school.vo.Student;

public class StudentService {
	List<Student> list = new ArrayList<>();

	// 학생 등록 메서드
	public void addStudent(Student student) {
		list.add(student);
	}
	
	// 특정 학생 검색 메서드
	public Student selectByStuNum(int stdNum) {
		for(Student s : list) {
			if(s.getStdNum() == stdNum) {
				return s;
			}
		}
		return null;
	}

	// 전체 회원 검색 메서드
	public List<Student> selectAll() {
		return list;
	}

	// 특정 회원 삭제 메서드
	public void deleteStudent(Student student) {
		list.remove(student);
	}
}










