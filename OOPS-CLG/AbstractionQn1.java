// Abstraction in Java
abstract class Control {
    abstract void turnOn();
    abstract void turnOff();
}

// abstract methods
class TVRemote extends Control {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

public class AbstractionQn1 {
    public static void main(String[] args) {
        Control remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}