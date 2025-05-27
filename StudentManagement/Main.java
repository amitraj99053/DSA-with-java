package Main;



public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Amit", "MCA");
        Student student2 = new Student(102, "Sumit Kumar", "MBA");
        Student student3 = new Student(103, "Rajesh Soni", "B-Tech CS");

        System.out.println(student1);
        System.err.println(student2);
        System.out.println(student3);
    }
}
