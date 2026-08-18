// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();

        System.out.println();

        Cat c = new Cat();
        c.eat();   // Inherited from Animal
        c.meow();
    }
}