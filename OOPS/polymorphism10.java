//method overriding example

public class polymorphism10 {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat(); // Calls the overridden method in Deer class .....Deer eats grass
        Animal animal = new Animal();
        animal.eat(); // Calls the method in Animal class.....easting...
        deer.eat();//Deer eats grass
        
    }
    
}
class Animal {
    void eat() {
        System.out.println("eats anuthing");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass");
    }
}