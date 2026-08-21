public class static12 {
    class Student{
    String name;
    int roll;

    static String schoolName; 
    // this is is common in all the obj of students .as we ceated s1 with school name bbps then all obj s2 s3 s4 will have same school name bbps until we change it in any one of them like s4 here we changed it to dav so now all obj will have dav as school name.

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

}

    public static void main(String[] args) {
    
        Student s1 = new Student();
        s1.schoolName = "BBPS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 =new Student();
        System.out.println(s3.schoolName);

        Student s4 =new Student();
        s4.schoolName ="dav";
        System.out.println(s4.schoolName);
        //  after this s4 name of all above s123  all will become saqme as s4.


        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);
        System.out.println(s4.schoolName);
    }

    //output-bbps bbps bpps dav dav dav dav dav ,,,reason below.
}
