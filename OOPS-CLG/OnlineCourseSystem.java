class Course {
    private String courseId;
    private String courseName;
    private int maxSeats;
    private String[] enrolledStudents;
    private int enrolledCount;

    private static int totalEnrolled = 0; 
    public Course(String id, String name, int seats) {
        this.courseId = id;
        this.courseName = name;
        this.maxSeats = seats;
        this.enrolledStudents = new String[seats];
        this.enrolledCount = 0;
    }

    public void enrollStudent(String studentName) {
        if (enrolledCount < maxSeats) {
            enrolledStudents[enrolledCount++] = studentName;
            totalEnrolled++;
            System.out.println(studentName + " enrolled successfully in " + courseName);
        } else {
            System.out.println("Enrollment failed. No seats available in " + courseName);
        }
    }

     public void displayCourseSummary() {
        System.out.println("\nCourse ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Seats: " + maxSeats);
        System.out.println("Enrolled Count: " + enrolledCount);
        System.out.print("Enrolled Students: ");
        if (enrolledCount == 0) {
            System.out.println("None");
        } else {
            for (int i = 0; i < enrolledCount; i++) {
                System.out.print(enrolledStudents[i] + (i < enrolledCount - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }


    public static void displayTotalEnrolled() {
    System.out.println("\nTotal Students Enrolled in All Courses: " + totalEnrolled);
    }
}

public class OnlineCourseSystem {
    public static void main(String[] args) {
        Course javaCourse = new Course("CSE101", "Java Programming", 3);
        Course pythonCourse = new Course("CSE102", "Python Programming", 2);

        javaCourse.enrollStudent("Amit");
        javaCourse.enrollStudent("Anchal");
        javaCourse.enrollStudent("Aditya");
        javaCourse.enrollStudent("David"); // Should fail

        pythonCourse.enrollStudent("Ballu");
        pythonCourse.enrollStudent("Ankul");
        pythonCourse.enrollStudent("Aman"); // Should fail

        javaCourse.displayCourseSummary();
        pythonCourse.displayCourseSummary();

        Course.displayTotalEnrolled();
    }
}


