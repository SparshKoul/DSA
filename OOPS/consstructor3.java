public class consstructor3 {
    
class MyStudent {
    String name;
    int roll;

    MyStudent() {
        System.out.println("constructor is called");
    }

    MyStudent(String name) {
        this.name = name;
    }

    

    MyStudent(int roll){
        this.roll = roll;
    }
}


    public static void main(String[] args) {
        MyStudent s1 =new MyStudent(); //these mystudent is the name of class, not the fxn name , as in contructor name of cons has to be same as class , so dont confuse
        

        MyStudent s2 = new MyStudent("sparsh");
        System.out.println(s2.name);
        MyStudent s3 = new MyStudent(1234);
        System.out.println(s3.roll);
        


        // it automatically picks numbers or string as we have made only empty ,string,int type nof constructor only ,
        //MyStudent s3 = new MyStudent("anuj",123);
        /// this will give error as there is no constructor that has int and string both as parameter together.
        
        


        // if we remove the 1st method in class (without) then the s1 const  will give error tooo as there is no such fxn which is empty

        // if we keep all 3 fxn in class and run nthem normally it will print --const is called --sparsh --1234


        // what if we addd System.out.println(s3.name);    it will print null as there is nor defined s3 as name as we defined s3 in roll only, but if we define it it will work



        //constructing overloading is when constructor picks fxn automatically,  this is ex of polymorphism


    }
}



//types of constructor
// 1. default constructor - no paramter
// 2. parameterized constructor - with paramter
// 3. copy constructor - copy the value of one object to another



//1)    like written above mystudent()  and then directprint   (1d const in class mystudent)
//2)   this one is above to aabove in which fxn is called with a parameter in it and then constructor is called (2st const in class mystudent )
