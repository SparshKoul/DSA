//typen1-method overloading

public class polymorphism9 {
    public static void main(String[] args) {
        calculator calc =new calculator();
        System.out.println(calc.sum(5, 10)); // int addition
        System.out.println(calc.sum(5.5, 10.5)); // double addition
        System.out.println(calc.sum(5.5f, 10.5f)); // float addition
        System.out.println(calc.sum(5, 10, 15)); // int addition with three parameters
        System.out.println(calc.sum("Hello", "World")); // string concatenation     
    }
    
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }
    
    double sum(double a, double b) {
        return a + b;
    }
    float sum(float a, float b) {
        return a + b;
    }

    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    String sum(String a, String b) {
        return a + " " + b;
    }
}