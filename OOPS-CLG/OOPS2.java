public class OOPS2 {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Amit");
        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int rollNo;

    // Non-parametrized constructors
    Student() {
        System.out.println("Constructor is called...");
    }

    // parametrized constructors
    Student(String name) {
        this.name = name;
    }

    // parametrized constructors
    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
}