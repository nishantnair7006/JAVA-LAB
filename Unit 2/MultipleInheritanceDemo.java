// First interface
interface Father {
    void showFather();
}

// Second interface
interface Mother {
    void showMother();
}

// Class implementing both interfaces
class Child implements Father, Mother {
    public void showFather() {
        System.out.println("This is Father's method.");
    }

    public void showMother() {
        System.out.println("This is Mother's method.");
    }

    void display() {
        System.out.println("This is Child class.");
    }
}

// Main class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();

        c.showFather();
        c.showMother();
        c.display();
    }
}