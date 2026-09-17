
// import java.util.*;
// import java.util.stream.*;

// public class sample {

//     public static class Employee {
//         int ID;
//         String name;
//         String email;
//         double salary;
//         String department;

//         Employee(int ID, String name, String email, double salary, String department) {
//             this.ID = ID;
//             this.name = name;
//             this.email = email;
//             this.salary = salary;
//             this.department = department;
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         sc.nextLine();

//         ArrayList<Employee> list = new ArrayList<>();

//         for (int i = 0; i < n; i++) {

//             int id = sc.nextInt();
//             sc.nextLine();

//             String name = sc.nextLine();

//             String email = sc.nextLine();

//             double salary = sc.nextDouble();
//             sc.nextLine();

//             String department = sc.nextLine();

//             list.add(new Employee(id, name, email, salary, department));
//         }

//         String wantedDepartment = sc.nextLine();

//         List<String> result = list.stream()
//                 .filter(x -> x.department.equals(wantedDepartment))
//                 .map(x -> x.name + " " + x.email)
//                 .collect(Collectors.toList());

//         if (result.isEmpty()) {
//             System.out.println("No employee");
//         } else {
//             result.forEach(System.out::println);
//         }
//     }
// }


import java.util.*;

class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String x = sc.next();

        for (int i = 0; i < n; i++) {
            if (arr[i].toLowerCase().startsWith(x.toLowerCase())) {
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println("No");
        sc.close();
    }
}