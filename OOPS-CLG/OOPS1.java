public class OOPS1 {
    public static void main(String args[]) {
        Student s1 = new Student("AMIT");
        System.out.println(s1.name);
        System.out.println(s1.rollNo);

    }
}

class Student {
    String name;
    int rollNo;

    Student(String name) {
        this.name = name;
        this.rollNo = 0;
    }
}