import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        System.out.println("wmk");
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);

        //to find no of rows and cols
        //int rows=matrix.length;
        //int cols=matrix[0].length;

        for(int i=0;i<3;i++){//rows
            for(int j=0;j<3;j++){//cols
                matrix[i][j]=sc.nextInt();
            }
        }

        //print
        for(int i=0;i<3;i++){//rows
            for(int j=0;j<3;j++){//cols
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();//new line after each row
        }


        ///search key
        System.out.println("enter key to search");

        int key=sc.nextInt();
        findKey(matrix,key);


        //largest
        int largest=largestIn2D(matrix);
        System.out.println("largest is "+ largest);

        //smallest
        int smallest=smallestIn2D(matrix);
        System.out.println("smallest is "+ smallest); 
        sc.close();



    }

    //fxn to find key in 2d array
    public static boolean findKey(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){//rows
            for(int j=0;j<matrix[0].length;j++){//cols
                if(matrix[i][j]==key){
                    System.out.println("key found at ("+ i +","+ j +")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }


    //fxn to find largest in 2d array
    public static int largestIn2D(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){//rows
            for(int j=0;j<matrix[0].length;j++){//cols
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }
    //fxn to find smallest in 2d array
    public static int smallestIn2D(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){//rows
            for(int j=0;j<matrix[0].length;j++){//cols
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
        }
        return smallest;
    }

    //FXN to find 2nd largest in 2d array 0(2nm)
    public static int secondlargest(int matrix[][]){
        int largest1=Integer.MIN_VALUE;
        int largest2=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){//rows
            for(int j=0;j<matrix[0].length;j++){//cols
                if(matrix[i][j]>largest1){
                    largest1=matrix[i][j];
                }
            }
        }
        for(int i=0;i<matrix.length;i++){//rows
            for(int j=0;j<matrix[0].length;j++){//cols
                if(matrix[i][j]>largest2 && matrix[i][j] !=largest1){
                    largest2=matrix[i][j];
                }
            }
        }
        return largest2;
        

    }

    //fxn to find second largest in 2 d array o(nm)
    public static int secondlargestt(int matrix[][]) {

    int largest1 = Integer.MIN_VALUE;
    int largest2 = Integer.MIN_VALUE;

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {

            int val = matrix[i][j];

            if (val > largest1) {
                largest2 = largest1;   // old largest becomes 2nd largest
                largest1 = val;
            }
            else if (val > largest2 && val != largest1) {
                largest2 = val;
            }
        }
    }

         return largest2;    
    }

    //kth largest  

    public static int kthLargest(int[][] matrix, int k) {

    int largest = Integer.MIN_VALUE;

    for (int count = 0; count < k; count++) {

        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                int val = matrix[i][j];

                if (val > currentMax && val < largest) {
                    currentMax = val;
                }
            }
        }

        largest = currentMax;
    }

    return largest;
}
}
