// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass
class Circle extends Shape {
    // Implement abstract method
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Main class
public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.display();   // Calls concrete method
        c.draw();      // Calls implemented abstract method
    }
}