package zpa;
import java.util.*;


public class solution {

    // public static void main(String[] args) {
    //     //sol1
    //     Scanner sc = new Scanner(System.in);
    //     int oamount = sc.nextInt();
    //     double discperc =sc.nextDouble();
    //     double servperc =sc.nextDouble();

    //     double disc= oamount *discperc/100;
    //     double afterdisc =oamount -disc;
    //     double serv = afterdisc *servperc /100;

    //     double finalam =afterdisc +serv;
    //     System.out.printf("%.2f",finalam);


    // }





    //sol2
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n =sc.nextInt();

    //     int arr[] = new int [n];
    //     int sum=0;
    //     int max =Integer.MIN_VALUE;
    //     int min =Integer.MAX_VALUE;

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();

    //         sum += arr[i];

    //         if (arr[i] > max) {
    //             max = arr[i];
    //         }

    //         if (arr[i] < min) {
    //             min = arr[i];
    //         }
    //     }
    //     double avg =sum/n;
    //     int diff =max-min;

    //     System.out.println(sum);
    //     System.out.printf("%.2f\n", avg);
    //     System.out.println(diff);   
    //}








    //sol3
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n =sc.nextInt();
    //     int sume=0;
    //     int sumo=0;
    //     while(n>0){
    //         int digit = n%10;
    //         if(digit %2 ==0){
    //             sume+=digit;
    //         }else{
    //             sumo+=digit;
    //         }
    //         n=n/10;
    //     }
    //     System.out.println("even "+sume);
    //     System.out.println("odd "+sumo);

        
    // }







    //sol4 
    //public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
     //   int n =sc.nextInt();
        // long arr [] = new long [n];
        // for(int i=0;i<n;i++){
        //     arr[i] =sc.nextLong();
        // }
        // for(int i=0;i<n;i++){
        //     arr[i] =arr[i]*1000;
        // }
        // for(int i=0;i<n-1;i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.print(arr[n-1]);



        //or

        // for(int i=0;i<n;i++){
        //     long kg =sc.nextLong();

        //     long g =kg*1000;
        //     System.out.print(g);
        //     if(i<n-1){
        //         System.out.print(" ");
        //     }
        // }
    //}





    //sol 5 GPT

    //SOL 6

    //public static void main(String[] args) {
        
    
   // Scanner sc =new Scanner(System.in);
   // int n =sc.nextInt();
   // int arr[] = new int [n];
   // for(int i=0;i<n;i++){
    //    arr[i] =sc.nextInt();
   // }

    //way1 with diff array
    // int index =0;
    // int newarr[] = new int [n];
    // for(int i=0;i<n;i++){
    //     if(arr[i]%2==0){
    //         newarr[index] =arr[i];
    //         index++;
    //     }
        
    // }
    // for(int i=0;i<n;i++){
    //     if(arr[i]%2 !=0){
    //         newarr[index] =arr[i];
    //         index++;
    //     }
    // }
    // for(int i=0;i<n;i++){
    // System.out.print(newarr[i]);
    // if(i<n-1){
    //     System.out.print(" ");
    // }
    // }




    //way 2 if no diff array
    // int evenpos=0;
    // for(int i=0;i<n;i++){
    //     if(arr[i] %2 ==0){
    //         int temp =arr[i];

    //         for(int j=i;j>evenpos;j--){
    //             arr[j] =arr[j-1];
    //         }
    //         arr[evenpos] =temp;
    //         evenpos++;
    //     }
    // }

    // for(int i=0;i<n;i++){
    //     System.out.print(arr[i]+" ");
    // }





    //sol7
    // public static void main(String[] args) {
        
    
    // Scanner sc =  new Scanner(System.in);
    // String str = sc.nextLine();
    // str= str.replace(" ", "");
    // int left =0;
    // int right =str.length()-1;
    // boolean flag =true;

    // while (left<right) {
    //     if(str.charAt(left)!=str.charAt(right)){
    //         flag =false;
    //         break;
    //     }
    //     left++;
    //     right--;
    // }
    // if(flag){
    //     System.out.println("pallindrome");
    // }
    // else{
    //     System.out.print("not");
    //     }

    // }




    




    
}