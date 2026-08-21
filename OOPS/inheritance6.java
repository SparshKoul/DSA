//types of inheritance
//2.multi level inheritance

public class inheritance6 {
    public static void main(String[] args) {
        
    
    Dog dobby= new Dog();
    dobby.eat();
    dobby.walk();
    dobby.legs = 4;// though legs were a property of Mammal class, but we can access it here as Dog is a child of Mammal.
    System.out.println(dobby.legs);
    
    
}
}
////parent class

class Animal {
    String color;
    void eat() {
        System.out.println("eating...");
    }
    void breath() {
        System.out.println("breathing...");
    }

    
}

//child 1 class

class Mammal extends Animal {
    int legs;
    void walk() {
        System.out.println("walking...");
    }
}

//class 2
class Dog extends Mammal {
    String breed;
    void bark() {
        System.out.println("barking...");
    }
}