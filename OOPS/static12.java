public class static12 {
    static class Student{
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
    
        new Student();
        Student.schoolName = "BBPS";

        new Student();
        System.out.println(Student.schoolName);

        new Student();
        System.out.println(Student.schoolName);

        new Student();
        Student.schoolName ="dav";
        System.out.println(Student.schoolName);
        //  after this s4 name of all above s123  all will become saqme as s4.


        System.out.println(Student.schoolName);
        System.out.println(Student.schoolName);
        System.out.println(Student.schoolName);
        System.out.println(Student.schoolName);
    }

    //output-bbps bbps bpps dav dav dav dav dav ,,,reason below.
}
