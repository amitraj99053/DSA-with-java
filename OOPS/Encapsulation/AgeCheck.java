public class AgeCheck {
    public static void main(String[] args) {
        // Create an Object of person class
        Person myObj = new Person();

        // setter method
        myObj.setName("Amit Kumar");
        myObj.setAge(22);

        // getter method
        System.out.println("Name: " + myObj.getName());
        System.out.println("Age: " + myObj.getAge());

        // setter method to update value of invalid age
        myObj.setAge(-5);
    }
}

class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0 && newAge <= 120) {
            this.age = newAge;
        } else {
            System.out.println("Invalid age provided.");
        }
    }

}
