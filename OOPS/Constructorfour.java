// constructors copyconst-

public class Constructorfour {

    public static void main(String[] args) {
        MyStudent s1= new MyStudent();
        s1.name="sparsh";
        ////or  both are same
        ////MyStudent s1 =new MyStudent("sparsh");
        ////MyStudent s1 =new MyStudent(name :"sparsh");

        
        s1.roll =123;
        s1.password="abcd";

        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        
        

        MyStudent s2 =new MyStudent(s1);//copy
        s2.password ="xyz";


        //it will print normaly all the elements in array of s1 as it is copied in s2;
        //but what if we change the value of s1,then run the lop of print; 
        // even after coping and we make a change in s1  , that change comes in s2 aswell  
        //bcoz s2 gets connect to s1 makrs aswell,rather then making another array that has same elemts , thats called deep copy


        s1.marks[2]=100;

        for(int i =0;i<3; i++){
            System.out.println(s2.marks[i]);
        }
        for(int i =0;i<3; i++){
            System.out.println(s1.marks[i]);
        }

        System.out.println(s1.password);
        System.out.println(s2.password);
        


    }
    
}
class MyStudent {
    String name;
    int roll;
    String password;
    int marks[];

    // all above are variables

    MyStudent() {
        marks=new int [3];// 3 subject store krna k liyea array  means 3 elements in array
        System.out.println("const is called");
    }

    MyStudent(String name) {
        marks=new int [3];// 3 subject store krna k liyea array means 3 elements in array
        this.name = name;
    }

    

    MyStudent(int roll){
        marks=new int [3];// 3 subject store krna k liyea array means 3 elements in array
        this.roll = roll;
    }


    // for copy cons we need to make an othermethod that works of mystudent and calls mystudent 
    // it copies all the information of s1 into s2


    //ex of shallow copy cons


    //MyStudent(MyStudent s1){
    //    marks=new int [3];// 3 subject store krna k liyea array means 3 elements in array
    //    this.name=s1.name;
    //    this.roll=s1.roll;
    //    this.marks = s1.marks;
    //} 


    //deep copy cons
    MyStudent(MyStudent s1){
        marks=new int [3];
        this.roll=s1.roll;
        this.name = s1.name;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    } 
    //will print smae 100-90-80
}