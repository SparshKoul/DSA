package exceptionhandling;
//custom exception 7: In Java, you can create your own custom exceptions by extending the Exception class or any of its subclasses. This allows you to define specific exception types that are relevant to your application or domain. By creating custom exceptions, you can provide more meaningful error messages and handle exceptional situations in a more structured manner.

//How to Create a Custom Exception?

//A custom exception is simply a class that extends Exception (checked) or extends RuntimeException (unchecked).







// class InvalidAgeException extends Exception {
//     InvalidAgeException(String message) {
//         super(message);
//     }
// }
// public class customexc {
//     static void checkAge(int age) throws InvalidAgeException {

//         if(age < 18) {
//             throw new InvalidAgeException("Age must be at least 18.");
//         }
//         System.out.println("Eligible");
//     }
//     public static void main(String[] args) {
//         try {
//             checkAge(15);
//         }
//         catch(InvalidAgeException e) {
//             System.out.println(e.getMessage());
//         }
//     }    
// }

//outputs:
//Age must be at least 18.




















//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

//BANK APPLICATION


class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

public class customexc {
    
    static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        double balance = 1000.0;
        double amountToWithdraw = 1500.0;

        try {
            withdraw(balance, amountToWithdraw);
        } catch(InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }    

    
}


//question for practive on testpad.