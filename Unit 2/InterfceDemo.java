// Interface
interface Animal {
    void sound();   // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class InterfceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}