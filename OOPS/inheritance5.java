public class inheritance5 {
    public static void main(String[] args) {
        
    
    Fish shark= new Fish();
    shark.eat();
    
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

//child class
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swimming...");
    }


}