//super keyword to access immediate parent class constructor and variables

public class super13 {
    public static void main(String[] args) {
        Horse h = new Horse();
        // This will call the constructor of Animal first, then Horse
        //output-Animal constructor called
        //output-Horse constructor called
        System.out.println("Horse colour: " + h.colour);
    }
    
}
class Animall{
    String colour;

    Animall(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animall {

    Horse(){
        
        super(); // Calls the constructor of the parent class Animal
        super.colour = "brown"; // Setting the colour of the horse
        System.out.println("Horse constructor called");
    }
    
}