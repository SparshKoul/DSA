// classes and objects    (oops 1,2)
// classes are not made in public class either b4 or after, it , it consists of attributs and fxn in it



public class ClassNobject1 {

    public static void main(String[] args) {
        //to use  those objects  there is a format, 1st = "class name" with variable name that we will  assign to it  = new class name()    --- the new  written creates space in memory where alll these info of pen will be stored.


        Pen p1 =new Pen();   // we have created a pen object with name p1
        Student s1 = new Student();
        //to set color in it .
        p1.fxncolur("blue");
        // this p1 is taegetted with setsolor fxn that is called by "."
        System.out.println(p1.color);
        // prints bluw


        p1.settip(5);
        System.out.println(p1.tip);


        p1.fxncolur("yellow");
        System.out.println(p1.color);
        // prints yellow 

        // or we can do 
        p1.color = "purple";
        System.out.println(p1.color);
        // prints purple


        s1.age = 19;
        System.out.println(s1.age);
    }
    
}

// object nameed pen
class Pen {
    //property
    String color;
    int tip;


    // now add fxn/method to it 

    void fxncolur(String newcolor){
        color = newcolor;
    }
    // ye fxn banaya jiska name = fxncolor hai or uska parameters new color nam k string hai , jis mai operation ho rha hai color ko jo original hai usko change krke newcolor


    // another fxn
    void settip(int newtip){
        tip =newtip;
    }
}

// another object
class Student {
    String name;
    int age;
    float percentage;


    void calcPercentage(int x , int y, int z){
        percentage = (x+y+z)/3;
    }
    
}



















// video 2

// access modifiers   private,public,default,protected
//determines where a particular piece of code can be accessed from.

//1] Only accessible within the same class.
//2] Accessible from anywhere in the project (and outside it, if imported)
//3] Accessible to any class in the same package. {no ket word requared}
//4] Accessible in the same class, same package, and in subclasses, even if they’re in different packages.


// class BankAccount{
//    // String username;   it is written below as username is to be kept public.
//    public String username;
//    private String password;

//    public void setpassword(String pwd){
//     password = pwd;
    
//    }

//    // for pass to print as it can be easily as it is private  ////after //myAcc.password = "abcd"; ,,,as it will show error.
//    public String getPassword() {
//     return password;
// }


// }
// public class ClassNobject1 {

//     public static void main(String[] args) {
//         // now if we want to make an object
//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "Sparsh";
//         //myAcc.password = "abcd";
//         // here it is error as password is private , so to acces it  we have to make a fxn in class 
//         myAcc.setpassword("abcdefgh");
//         System.out.println(myAcc.username);
//         // to print password we need to make another fxnand use return in it;
//         System.out.println(myAcc.getPassword());
        
        
//     }
// }
