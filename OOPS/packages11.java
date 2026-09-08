// import java.util.Scanner;

// public class packages11 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println( a);
//     }
// }



// sc nam k object create kiya hai jo Scanner class ka hai.
// Scanner class ko import kiya gaya hai jo java.util package mein hai.





////Abstraction

/// Abstraction is a process of hiding the implementation details and showing only the functionality to the user.
/// It helps to reduce complexity and increase efficiency.



//for abstract class we cant create onject if that cbstract class.





// public class packages11 {

//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.eat();
//         horse.walk();

//         Chicken chicken = new Chicken();
//         chicken.eat();
//         chicken.walk();

//         // Demonstrating the constructor
//         System.out.println("Horse colour: " + horse.colour);


//         Mustang mustang = new Mustang();
//         // WE KNOW THE HIREARCHY OF CLASSES HERE
//         //ANIMAL -> HORSE -> MUSTANG
        

       
//     }
// }

// abstract class Animal {
//     // CONSEPT OF CONSTRUCTORS HERE
//     String colour;
//     Animal() {//animnal class mai animal ka cons, jo obvious same nahi he likhna padhta
//         colour = "brown"; // default colour
//         System.out.println("animal constructor called");
//     }
    
//     void eat() {
//         System.out.println("eating...");
//     }
    
//     abstract void walk();
//tells each subclass should have their own implementation of walk() method.
//this tells that abstract class's animal has a fxn walk but it is not defined here. and each subclass would determine how  their animal walks.

    
// }
// class Horse extends Animal {
//     Horse() {
        
//         System.out.println("Horse constructor called");
//     }
//     void changecolour() {
//         colour = "blue"; // changing the colour of horse
       
//     }
    
//     void walk() {
//         System.out.println("Horse walks on four legs");
//     }

    
// }
// // here it is necessory / compulsory to implement the abstract method walk() in Horse class.
// // If we don't implement the abstract method walk() in Horse class, then it will give an error.
// // as horse class is inheriting the Animal class which has an abstract method walk().


// class Mustang extends Horse {
//     Mustang() {
//         System.out.println("Mustang constructor called");
//     }
    
    
    
// }


// class Chicken extends Animal {
    
//     void walk() {
//         System.out.println("Chicken walks on two legs");
//     }
// }




// // here abstraction works in such a way that i gives an idea of a fxn that is common in in its child class, but works differently in each child class.
// // In this case, the eat() method is common in both Horse and Chicken classes, but the walk() method is implemented differently in each class.






//class-extends
//interface-implements

//inteface

public class packages11 {

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
        //ABSTRACTION WORKS HERE IN SUCH  WAY THAT MOVES IS A COMMON FUNCTIONALITY FOR ALL CHESS PLAYERS.
        // AND WHEN CALLLED FOR QUEEN, IT SHOWS THE FUNCTIONALITY OF QUEEN.
         


        Beer bear = new Beer();
        bear.eatplants();   
        bear.eatmeat();
        bear.multi(); // this is a method of Bear class which has properties of both Herbivore
    }
}


interface Chesspplayer {
    void moves();
    
}


class Queen implements Chesspplayer {
    public void moves() {
        System.out.println("Queen can move any number of squares in any direction.");
    }
}

class Rook implements Chesspplayer {
    public void moves() {
        System.out.println("Rook can move any number of squares horizontally or vertically.");
    }
}
class King implements Chesspplayer {
    public void moves() {
        System.out.println("King can move one square in any direction.");
    }
}



//MULTIPLE INHERITANCE IS NOT POSSIBLE IN JAVA DIRECTLY, BUT WE CAN ACHIEVE IT USING INTERFACES.

interface Herbivore {
    void eatplants();
}
interface Carnivore {
    void eatmeat();
    
}

class   Beer implements Herbivore, Carnivore {
   public void eatplants() {
        System.out.println("Bear eats plants.");
    }

    public void eatmeat() {
        System.out.println("Bear eats meat.");
    }

    public void multi() {
        System.out.println("has prop of both");
    }
}