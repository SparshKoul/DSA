import java.util.*;

public class matrix {

    public   static void multiplyMatrix(int A[][],int B[][], int R1, int C1, int R2, int C2) {
        int [][] ans =new int [R1][C2];

        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                for(int k=0;k<C1;k++){
                    ans[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        //print
        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void addMatrix(int A[][],int B[][], int R1, int C1, int R2, int C2) {
        if(R1!=R2 || C1!=C2){
            System.out.println("matrix addition not possible");
            return;
        }

        int [][] ans =new int [R1][C2];

        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                ans[i][j]=A[i][j]+B[i][j];
            }
        }

        //print
        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void spiral(int matrix[][], int R, int C) {
        int top=0;
        int bottom=R-1;
        int left=0;
        int right=C-1;

        while(top<=bottom && left<=right){
            //top row
            for(int i=left;i<=right;i++){
                System.out.println(matrix[top][i]+" ");
            }
            top++;

            //right col
            for(int i=top;i<=bottom;i++){
                System.out.println(matrix[i][right]+" ");
            }
            right--;

            //bottom row
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(matrix[bottom][i]+" ");
                }
                bottom--;
            }

            //left col
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(matrix[i][left]+" ");
                }
                left++;
            }
        }
    }

    //transpose of matrix
    public static void transpose(int matrix[][], int R, int C) {
        int ans[][]=new int[C][R];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                ans[j][i]=matrix[i][j];
            }
        }

        //print
        for(int i=0;i<C;i++){
            for(int j=0;j<R;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    //sum of each row
    public static void sumOfEachRow(int matrix[][], int R, int C) {
        for(int i=0;i<R;i++){
            int sum=0;
            for(int j=0;j<C;j++){
                sum+=matrix[i][j];
            }
            System.out.println("sum of row "+i+" is "+sum);
        }
    }

    //sum of each col
    public static void sumOfEachCol(int matrix[][], int R, int C) {
        for(int j=0;j<C;j++){
            int sum=0;
            for(int i=0;i<R;i++){
                sum+=matrix[i][j];
            }
            System.out.println("sum of col "+j+" is "+sum);
        }
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

    //fxn to search elements in 2d array
    public static boolean searchElement(int matrix[][], int R, int C, int target) {
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j]==target){
                    System.out.println("Element found at position ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
    }

    //optimized search in sorted 2d array
    public static boolean optimizedSearch(int matrix[][], int R, int C, int target) {
        int row=0;
        int col=C-1;

        while(row<R && col>=0){
            if(matrix[row][col]==target){
                System.out.println("Element found at position ("+row+","+col+")");
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Element not found");
        return false;
    }


    //rotate matrix by 90 degrees
    public static void rotateMatrix(int matrix[][], int R, int C) {
        
        //transpose
        for(int i=0;i<R;i++){
            for(int j=i;j<C;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse each row
        for(int i=0;i<R;i++){
            int left=0;
            int right=C-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }

        //print
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows and cols of 1st matrix");
        int R1=sc.nextInt();
        int C1=sc.nextInt();

        System.out.println("enter rows and cols of 2nd matrix");
        int R2=sc.nextInt();
        int C2=sc.nextInt();

        if(C1!=R2){
            System.out.println("matrix multiplication not possible");
            return;
        }

        int A[][]=new int[R1][C1];
        int B[][]=new int[R2][C2];

        System.out.println("enter elements of 1st matrix");
        for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++){
                A[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter elements of 2nd matrix");
        for(int i=0;i<R2;i++){
            for(int j=0;j<C2;j++){
                B[i][j]=sc.nextInt();
            }
        }

        multiplyMatrix(A,B,R1,C1,R2,C2);


        //
    
    }
    
}
