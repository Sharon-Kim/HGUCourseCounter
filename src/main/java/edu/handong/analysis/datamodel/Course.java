package edu.handong.analysis.datamodel;

public class Course {
	private String studentId;
	private String yearMonthGraduated;
	private String firstMajor;
	private String secondMajor;
	private String courseCode;
	private String courseName;
	private String courseCredit;
	private int yearTaken;
	private int semesterCourseTaken;
	
	public String getStudentId() {
		return studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getYearMonthGraduated() {
		return yearMonthGraduated;
	}
	
	public void setYearMonthGraduated(String yearMonthGraduated) {
		this.yearMonthGraduated = yearMonthGraduated;
	}
	
	public String getFirstMajor() {
		return firstMajor;
	}
	
	public void setFirstMajor(String firstMajor) {
		this.firstMajor = firstMajor;
	}
	
	public String getSecondMajor() {
		return secondMajor;
	}
	
	public void setSecondMajor(String secondMajor) {
		this.secondMajor = secondMajor;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseCredit() {
		return courseCredit;
	}
	
	public void setCourseCredit(String courseCredit) {
		this.courseCredit = courseCredit;
	}
	
	public int getYearTaken() {
		return yearTaken;
	}
	
	public void setYearTaken(int yearTaken) {
		this.yearTaken = yearTaken;
	}
	
	public int getSemesterCourseTaken() {
		return semesterCourseTaken;
	}
	
	public void setSemesterCourseTaken(int semesterCourseTaken) {
		this.semesterCourseTaken = semesterCourseTaken;
	}
	
	public Course(String line) {
		String[] studentInfo = line.split(", ");
		studentId = studentInfo[0];
		yearMonthGraduated = studentInfo[1];
		firstMajor = studentInfo[2];
		secondMajor = studentInfo[3];
		courseCode = studentInfo[4];
		courseName = studentInfo[5];
		courseCredit = studentInfo[6];
		yearTaken = Integer.parseInt(studentInfo[7]);
		semesterCourseTaken = Integer.parseInt(studentInfo[8]);
	}
}