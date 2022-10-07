package Other;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Hoon");
    }
}

// Subclass (inherit from Animal)
class cat extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: miao");
    }
}

class Main {
    public static void main(String[] args) {
        cat mycat = new cat(); // Create a cat object
        mycat.animalSound();
        mycat.sleep();
    }
}