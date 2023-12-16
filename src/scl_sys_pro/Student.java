package scl_sys_pro;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
	
	    String firstName;
	    String lastName;
	    int registration;
	    int grade;
	    int year;

	    // Constructors
	    public Student(String firstName, String lastName, int registration, int grade, int year) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.registration = registration;
	        this.grade = grade;
	        this.year = year;
	    }

	    public Student(String firstName, String lastName, int registration) {
	        this(firstName, lastName, registration, 0, 1);
	    }

	    public Student(String firstName, String lastName) {
	        this(firstName, lastName, 0, 0, 1);
	    }

	    // Methods
	    public void printFullName() {
	        System.out.println(firstName + " " + lastName);
	    }

	    public boolean isApproved() {
	        return grade >= 60;
	    }

	    public int changeYearIfApproved() {
	        if (isApproved()) {
	            year++;
	            System.out.println("Congratulations!");
	        }
	        return year;
	    }
	}

	class Course {
	    String courseName;
	    String professorName;
	    int year;
	    ArrayList<Student> enrolledStudents = new ArrayList<>();

	    // Constructors
	    public Course(String courseName, String professorName, int year) {
	        this.courseName = courseName;
	        this.professorName = professorName;
	        this.year = year;
	    }

	    // Methods
	    public void enroll(Student student) {
	        enrolledStudents.add(student);
	    }

	    public void enroll(Student[] students) {
	        enrolledStudents.addAll(Arrays.asList(students));
	    }

	    public void unEnroll(Student student) {
	        enrolledStudents.remove(student);
	    }

	    public int countStudents() {
	        return enrolledStudents.size();
	    }

	    public int bestGrade() {
	        int maxGrade = 0;
	        for (Student student : enrolledStudents) {
	            maxGrade = Math.max(maxGrade, student.grade);
	        }
	        return maxGrade;
	    }

	    // Additional challenges
	    public double calculateAverageGrade() {
	        int totalGrade = 0;
	        for (Student student : enrolledStudents) {
	            totalGrade += student.grade;
	            
	        }
	        System.out.println("Average grade is: " + totalGrade / enrolledStudents.size());
	        return (double) totalGrade / enrolledStudents.size();
	    }

	    public void displayRanking() {
	        enrolledStudents.sort((s1, s2) -> Integer.compare(s2.grade, s1.grade));
	        for (Student student : enrolledStudents) {
	            System.out.println(student.firstName + " " + student.lastName + ": " + student.grade);
	        }
	    }

	    public void showAboveAverage() {
	        double averageGrade = calculateAverageGrade();
	        System.out.println("Students above average:");
	        for (Student student : enrolledStudents) {
	            if (student.grade > averageGrade) {
	                System.out.println(student.firstName + " " + student.lastName);
	            }
	        }
	    }
	}
