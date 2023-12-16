package scl_sys_pro;

class Main{
	
	    public static void main(String[] args) {
	        // Create students
	        Student student1 = new Student("Aswini", "T", 1, 70, 2023);
	        Student student2 = new Student("Lavanya", "ks",2, 65 , 2023);

	        // Create course
	        Course javaCourse = new Course("Java", "Prof. shivan", 2023);

	        // Enroll students
	        javaCourse.enroll(student1);
	        javaCourse.enroll(student2);

	        // Display course info
	        System.out.println("Course name: " + javaCourse.courseName);
	        System.out.println("Professor name: " + javaCourse.professorName);
	        System.out.println("Year: " + javaCourse.year);
	        System.out.println("Number of Students: " + javaCourse.countStudents());
	        System.out.println("Best Grade: " + javaCourse.bestGrade());

	        // Additional challenges
	        javaCourse.enroll(new Student("kavi", "pk", 3, 97, 2024));
	        System.out.println("Number of students after enrolling : " + javaCourse.countStudents());
	        javaCourse.displayRanking();
	        javaCourse.showAboveAverage();
	    }
	
}
