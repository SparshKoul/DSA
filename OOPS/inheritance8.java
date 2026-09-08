//hybrid inheritance in java
public class inheritance8 {
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

        Shark sharky = new Shark();
        sharky.attack();

        Tuna tuna = new Tuna();
        tuna.fast_swim();

        Peacock peacock = new Peacock();
        peacock.beautifull();

        Dog dog = new Dog();
        dog.bark();

        human person = new human();
        person.fighting();
        person.walk(); // human can also walk as it is a Mammal
        person.legs = 2; // setting legs for human
        System.out.println("Human has " + person.legs + " legs.");
        
    }
}
class Animal {
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
class Bird extends Animal {
    int wings;
    void fly() {
        System.out.println("flying...");
    }
}
class Fish extends Animal {
    void swim() {
        System.out.println("swimming...");
    }
}


class Shark extends Fish {
    void attack() {
        System.out.println("ATACKING...");
    }
}

class Tuna extends Fish {
    void fast_swim() {
        System.out.println("fast swimming...");
    }
}




class Peacock extends Bird {
    void beautifull() {
        System.out.println("peacockis beautifull...");
    }
}




class Dog extends Mammal {
    void bark() {
        System.out.println("barking...");
    }
}
class human extends Mammal {
    void fighting() {
        System.out.println("FIGHTING...");
    }
}
