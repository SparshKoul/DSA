
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
    public static void topk(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : arr){
            pq.add(s);
        }
        while(k > 0){

            if(k == 1){
                System.out.print(pq.poll());
            }
            else{
                System.out.print(pq.poll()+" ");
            }
            k--;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(arr.length > k){
            topk(arr,k);
        }

    }
}
