import java.util.*;
import java.lang.*;
import java.io.*;



class Codechef{


    
    public static int evalprefix(String exp){
        Stack <Integer> stack =new Stack<>();
        for( int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch-'0');//char to int
            }
            else{
                int a=stack.pop();
                int b=stack.pop();
                switch(ch){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                }
            }
        }
        
        return stack.pop();
    }
    
    public static int evaluatepostfix(String exp){
        Stack <Integer> stack =new stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isDigit(ch)){
                stack.push (ch-'0');//char to int 
            }
            else{
                int b=stack.pop();
                int a=stack.pop();
                
                switch(ch){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    //approach\
 //   Traverse the string:
//If opening bracket → push
//if closing bracket:
//If stack top is opening → pop (valid pair)
//Else → push closing bracket
//After traversal:
//Stack contains only invalid brackets


    public static int minreversals (String s){
        //if len is odd never be balanced
        
        if(s.length() %2 !=0){
            return -1;
        }
        Stack <Character> Stack=new Stack<>();
        
        //remove balance oairs
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //opening push
            if(ch=='['){
                stack.push(ch);
                
            }
            else{
                if(!stack.isEmpty()  && stack.peek() =='['){
                    stack.pop();
                }
                else{
                    stack.push();
                }
                
            }
            
        }
        //count remaining unbalanced
        int open=0;
        int close=0;
        while(!stack.isEmpty()){
            if(stack.pop() =='['){
                open++;
            }else close++;
        }
        return (open+1) /2   + ( close+1 )  /2;
    }
    public static int minadd(String s){
        int open=0;//how many '(' needs closing ones
        int close=0;//how many open needed;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                open++;
            }
            else{
                if(open>0)open--;
                else close++;
            }
        }
        return open+close;
    }
    public static boolean duplicateparethesis(String str){
        
        Stack <Integer> Stack =new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek() !='('){
                    Stack.pop();
                    count++;
                }
                if(count<0){
                    return false;
                }
                else{
                    Stack.pop();
                }
            }
            else{
                Stack.push(ch);
            }
        }
        return false;
    }
    public static boolean validparentesis(String str){
        Stack<Integer> stack=new stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch=='{' ||ch== '(' ||ch== '['){
                stack.push(ch);
            }
            else{//closing 
                
                if(stack.isEmpty()){
                    return false;//no opn bracket to match
                }
                else if (stack.peek()=='(' && ch==')'   ||
                         stack.peek()=='[' && ch==']'   || 
                         stack.peek()=='{' && ch=='}'){
                             stack.pop();
                         }
                         
                else{
                    return false;
                }
        } 
    }
        
        if(stack.isEmpty()){
            return true;
        }
        else {return false;
        }
        
    }

    public static void nextgreaterelement(int arr[]){
        int n=arr.length;
        int nge[]=new int [n];
        
        for(int i=0;i<n;i++){
            int next=-1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    next=arr[j];
                    break;
                }
            }
            //nge[i]=next; if fxn was int[]
            System.out.print(next + " ");
            
        }
        //return nge;
    }
    
    public static void revstack(Stack <Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top=s.pop();
        revstack(s);
        pushatbottom(s,top);
    }
        
    public static String revstr(String str){
        Stack <Character> s=new Stack<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s.push(ch);
        }
        
        StringBuilder sb =new StringBuilder("");
        while( !s.isEmpty()){
            sb.append(s.pop());
        }
        
        return sb.toString();
    }
    
    public static void pushatbottom(Stack<Integer> s,int data){
        //base
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        
        int top=s.pop();
        pushatbottom(s,data);
        
        s.push(top);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack <Integer> s=new Stack <>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		pushatbottom(s,0);
		
		while(!s.isEmpty()){
		    System.out.println(s.pop());
		}
		
		String st="abcd";
		System.out.println(revstr(st));
		

	}
}
