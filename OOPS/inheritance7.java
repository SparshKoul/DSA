// hirearchy inheritance

public class inheritance7 {
    public static void main(String[] args) {

        Mammal mam = new Mammal();
        mam.eat();
        mam.walk();
        mam.legs = 4; // though legs were a property of Mammal class, but we can access it here as Dog is a child of Mammal.
        System.out.println(mam.legs);

        Fish nemo = new Fish();
        nemo.eat();
        nemo.swim();
        nemo.breath();

        Bird tweety = new Bird();
        tweety.eat();
        tweety.fly();
        
    }
    
}

abstract class Animal {
    String color;
    void eat() {
        System.out.println("eating...");
    }
    void breath() {
        System.out.println("breathing...");
    }

    
}

class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("walking...");
    }
}

class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swimming...");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flying...");
    }
}
