public class OOPS1 {
    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.name);
    }
}

// Non-parametrized constructors
class Student {
    String name;

    public Student() {
        System.out.println("constructor is called ...");
    }
}