public class OOPS {
    public static void main(String[] args) {

        // Pen class 
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);
        System.out.println();

        // Student class
        Student s1 = new Student();
        s1.setName("Amit_Kumar");
        System.out.println(s1.name);
        s1.setAge(22);
        System.out.println(s1.age);
        s1.calcPercentage(65, 60, 70);
        System.out.println(s1.percentage);
        System.out.println();


        // Bank class
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "AmitKumar";
        System.out.println(myAcc.userName);
        myAcc.setPassword("abcdefghi22");
        System.out.println(myAcc.getPassword());

    }

}

class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

    String getPassword() {
        return this.password;
    }
}


class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void setName(String newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}