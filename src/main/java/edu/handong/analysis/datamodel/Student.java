package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String studentId;
	private ArrayList<Course> coursesTaken;
	private HashMap<String,Integer> semestersByYearAndSemester;
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public Student(String studentId) {
		this.setStudentId(studentId);
		coursesTaken = new ArrayList<Course>();
		semestersByYearAndSemester = new HashMap<String,Integer>();
	}
	
	public void addCourse(Course newRecord) {
		coursesTaken.add(newRecord);
	}
	
	public HashMap<String,Integer> getSemestersByYearAndSemester() {
		int semester = 1;
		
		for(Course newCourse : coursesTaken) {
			String courseString = new String();
			courseString = Integer.toString(newCourse.getYearTaken()) + "-" + Integer.toString(newCourse.getSemesterCourseTaken());
			
			if(!semestersByYearAndSemester.containsKey(courseString))
				semestersByYearAndSemester.put(courseString, semester++);
			else{
				continue;
			}
		}
		return semestersByYearAndSemester;
	}
	
	public int getNumCourseInNthSementer(int semester) {
		int courseNum = 0;
		
		for(String key : semestersByYearAndSemester.keySet()) {
			if(semestersByYearAndSemester.get(key).intValue() == semester) {
				for(Course newCourse : coursesTaken) {
					String courseString = new String();
					courseString = Integer.toString(newCourse.getYearTaken()) + "-" + Integer.toString(newCourse.getSemesterCourseTaken());
					if(courseString.equals(key))
						courseNum++;
				}
			}
		}
		
		return courseNum;
	}
}