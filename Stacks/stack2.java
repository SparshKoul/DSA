// //valid parentheses using stack

// package zcourse.Stacks;

// import java.util.*;

// public class stack2 {
//     public static boolean validParentheses(String str) {
//         Stack<Character> stack = new Stack<>();
 
//         //for (char ch : str.toCharArray()) {//same thing as below 2 lines.

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             //push opening brackets onto stack
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             } else  {
//                 if (stack.isEmpty() ) {// pehle koi opening bracket hi nahi hai but closing aagya so  directly invalid.
//                     return false;
//                 }
//                 //now check for closing brackets ...stack ke top ko check with current char
//                 //if matches pop .... else return false

//                 else if(stack.peek()=='(' && ch==')' || stack.peek()=='{' && ch=='}' || stack.peek()=='[' && ch==']'){
//                     stack.pop();
//                  }else{
//                 return false;
//             }
//             } 
//         }

//         if(stack.isEmpty()){
//             return true;
//         }else{
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         String str = "({})[]";
//         System.out.println(validParentheses(str));
//     }

// }




















// //duplicate parentheses using stack






//We push everything into stack except when we see ')'.

//When ) appears:
//Count how many characters are inside the brackets
//If count = 0 → duplicate found

//We pop everything until '('
//count tells how many characters were inside


//dry run ((a+b))
//Push ( → (
//Push ( → ( (
//Push a → ( ( a
//Push + → ( ( a +
//Push b → ( ( a + b


//Now ) appears:
//pop b, +, a → count = 3 → OK
//Pop '('

//Next ) appears:
//Immediately sees '(' in stack
//count = 0 ❌ → DUPLICATE FOUND





//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx//
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx//



// package zcourse.Stacks;
// import java.util.*;

// public class stack2 {
//     public static boolean duplicateParentheses(String str) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             //agar closing ka cases na hua =openig k case hai

//             if (ch == ')') {// Now check what is inside the brackets.
//                 int count = 0;
//                 while (stack.peek() != '(') {
//                     stack.pop();
//                     count++;
//                 }



//                 if (count < 1) {
//                     return true; // Duplicate parentheses found
//                 } else {
//                     stack.pop(); // Pop the opening parenthesis
//                 }
//             } else {//openig condition
//                 stack.push(ch);
//             }
//         }
//         return false; // No duplicate parentheses found
//     }
//     public static void main(String[] args) {
//         String str = "((a+b)+((c+d)))";//true -duplicate
//         String str2 = "(a+b)+(c+d)";//false-no duplicate
//         System.out.println(duplicateParentheses(str));
//         System.out.println(duplicateParentheses(str2));
//     }

    
// }












//minimum add to make parentheses valid
//Add minimum brackets to make string valid.

//"(()"  -> 1
//"))((" -> 4


// public class stack2 {

//     public static int minAdd(String s) {
//         int open = 0;//unmatched '('..........    how many '(' still need ')'
//         int close = 0;//how many open bracket are need.

//         for (char ch : s.toCharArray()) {
//             if (ch == '(') {
//                 open++;
//             } else {// ch == ')'
//                 if (open > 0) open--; // match with '('
//                 else close++;          // extra ')' 
//             }
//         }
//         return open + close;
//     }
//     public static void main(String[] args) {
//         String s1 = "(()";
//         String s2 = "))((";
//         System.out.println("Minimum additions for \"" + s1 + "\": " + minAdd(s1));
//         System.out.println("Minimum additions for \"" + s2 + "\": " + minAdd(s2));
//     }
// }










//remove invalid parentheses (count)
//Input: "())("
//Output: 2


//Logic Same as minimum add — unmatched ones must be removed.

// public class stack2 {

//     public static int minRemove(String s) {
//         int open = 0, remove = 0;

//         for (char ch : s.toCharArray()) {
//             if (ch == '(') {
//                 open++;
//             } else {
//                 if (open > 0) open--;
//                 else remove++;
//             }
//         }
//         return remove + open;
//     }
//     public static void main(String[] args) {
//         String s = "())(";
//         String s2 = "((()))())(";
//         System.out.println("Minimum removals for \"" + s2 + "\": " + minRemove(s2));
//         System.out.println("Minimum removals for \"" + s + "\": " + minRemove(s));
//     }
// }







//lomgest valid parentheses substring
//input: ")()())"
//Output: 4   → "()()"

// import java.util.Stack;

// public class stack2 {

//     public static int longestValid(String s) {
//         Stack<Integer> st = new Stack<>();
//         st.push(-1);
//         int max = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                 st.push(i);
//             } else {
//                 st.pop();
//                 if (st.isEmpty()) {
//                     st.push(i);
//                 } else {
//                     max = Math.max(max, i - st.peek());
//                 }
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         String s = ")()())";  
//         System.out.println("Longest valid parentheses substring length: "  + longestValid(s));
//     }
// }







////modified longest valid parentheses substring 

//to get length of longest valid parentheses substring as well as string itself
// import java.util.Stack;

// public class stack2 {

//     public static String longestValidSubstring(String s) {
//         Stack<Integer> st = new Stack<>();
//         st.push(-1);

//         int maxLen = 0;
//         int start = 0;

//         for (int i = 0; i < s.length(); i++) {

//             if (s.charAt(i) == '(') {
//                 st.push(i);
//             } else {
//                 st.pop();

//                 if (st.isEmpty()) {
//                     st.push(i);
//                 } else {
//                     int currLen = i - st.peek();

//                     if (currLen > maxLen) {
//                         maxLen = currLen;
//                         start = st.peek() + 1;
//                     }
//                 }
//             }
//         }

//         return s.substring(start, start + maxLen);
//     }

//     public static void main(String[] args) {
//         String s = ")()())";
//         String result = longestValidSubstring(s);

//         System.out.println("Longest valid substring: " + result);
//         System.out.println("Length: " + result.length());
//     }
// }



//minimum reversals to make parentheses valid
// import java.util.*;

// public class Main {
// static int minReversals(String s) {

//     // STEP 1: If length is odd, it can never be balanced
//     if (s.length() % 2 != 0) {
//         return -1;
//     }

//     Stack<Character> stack = new Stack<>();

//     // STEP 2: Remove all balanced pairs
//     for (int i = 0; i < s.length(); i++) {
//         char ch = s.charAt(i);

//         // If opening bracket, push
//         if (ch == '[') {
//             stack.push(ch);
//         }
//         // If closing bracket
//         else {
//             // If top is opening, pair is balanced → pop
//             if (!stack.isEmpty() && stack.peek() == '[') {
//                 stack.pop();
//             }
//             // Else unbalanced closing bracket
//             else {
//                 stack.push(ch);
//             }
//         }
//     }

//     // STEP 3: Count remaining unbalanced brackets
//     int open = 0, close = 0;

//     while (!stack.isEmpty()) {
//         if (stack.pop() == '[') {
//             open++;
//         } else {
//             close++;
//         }
//     }

//     // STEP 4: Calculate minimum reversals
//     return (open + 1) / 2 + (close + 1) / 2;
// }




//maximum area histogram using stack
//O(n^2) approach BRUTE FORCE

// package zcourse.Stacks;
// import java.util.*;

// public class stack2 {

//     public static int maxAreaHistogram(int heights[]) {
//         int maxArea = 0;

//         for (int i = 0; i < heights.length; i++) {
//             int height = heights[i];

//             //left
//             int left = i;
//             while (left >= 0 && heights[left] >= height) {
//                 left--;
//             }
//             //right
//             int right = i;
//             while (right < heights.length && heights[right] >= height) {
//                 right++;
//             }

//             //width
//             int width = right - left - 1;
//             int area = height * width;
//             maxArea = Math.max(maxArea, area);
//         }
//         return maxArea;
//     }
//     public static void main(String[] args) {
//         int heights[] = {2, 1, 5, 6, 2, 3};
//         System.out.println("Maximum Area Histogram: " + maxAreaHistogram(heights));
//     }
// }










// //MAX IMUM AREA HISTOGRAM USING STACK -OPTIMIZED O(N) APPROACH
// package zcourse.Stacks;

// import java.util.*;

// public class stack2 {

//     public static int maxAreaHistogram(int heights[]) {
//         int n = heights.length;
//         int maxArea = 0;

//         int nsl[] = new int[n]; // next smaller left  nextsmaller left
//         int nsr[] = new int[n]; // next smaller right  nextsmaller right

//         Stack<Integer> stack = new Stack<>();

//         // 🔹 NSL (Next Smaller to Left)
//         for (int i = 0; i < n; i++) {
//             while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
//                 stack.pop();
//             }
//             if (stack.isEmpty()) {
//                 nsl[i] = -1;
//             } else {
//                 nsl[i] = stack.peek();
//             }
//             stack.push(i);
//         }


//         // Clear stack for NSR calculation

//         stack.clear();

//         // 🔹 NSR (Next Smaller to Right)
//         for (int i = n - 1; i >= 0; i--) {
//             while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
//                 stack.pop();
//             }
//             if (stack.isEmpty()) {
//                 nsr[i] = n;
//             } else {
//                 nsr[i] = stack.peek();
//             }
//             stack.push(i);
//         }

//         // 🔹 Calculate max area
//         for (int i = 0; i < n; i++) {
//             int height = heights[i];
//             int width = nsr[i] - nsl[i] - 1;
//             int area = height * width;
//             maxArea = Math.max(maxArea, area);
//         }

//         return maxArea;
//     }

//     public static void main(String[] args) {
//         int heights[] = {2, 1, 5, 6, 2, 3};
//         System.out.println("Max Area Histogram: " + maxAreaHistogram(heights));
//     }
// }











// //Infix to Postfix using stack

// package zcourse.Stacks;
// import java.util.Stack;


// class stack2{

//     // precedence function
//     static int precedence(char ch) {
//         switch (ch) {
//             case '+':
//             case '-':
//                 return 1;
//             case '*':
//             case '/':
//                 return 2;
//             case '^':
//                 return 3;
//         }
//         return -1;
//     }

//     static String infixToPostfix(String infix) {
//         StringBuilder postfix = new StringBuilder();
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < infix.length(); i++) {
//             char ch = infix.charAt(i);

//             // 1️⃣ If operand,   add it  in result
//             if (Character.isLetterOrDigit(ch)) {
//                 postfix.append(ch);
//             }

//             // 2️⃣ If '(', push to stack
//             else if (ch == '(') {
//                 stack.push(ch);
//             }

//             // 3️⃣ If ')', pop until '('
//             else if (ch == ')') {
//                 while (!stack.isEmpty() && stack.peek() != '(') {
//                     postfix.append(stack.pop());
//                 }
//                 stack.pop(); // remove '('
//             }

//             // 4️⃣ If operator
//             else {
//                 while (!stack.isEmpty() &&
//                        precedence(stack.peek()) >= precedence(ch)) {
//                     postfix.append(stack.pop());
//                 }
//                 stack.push(ch);
//             }
//         }

//         // pop remaining operators
//         while (!stack.isEmpty()) {
//             postfix.append(stack.pop());
//         }

//         return postfix.toString();
//     }

//     public static void main(String[] args) {
//         String infix = "a+b*(c-d)";
//         System.out.println("Postfix: " + infixToPostfix(infix));//output: abcd-*+     
//     }
// }







//infix to prefix using stack

//prefix = reverse(postfix of reversed infix)
//(a+b)*c
//prefix -*+abc



// import java.util.Stack;

// public class InfixToPrefix {

//     static int precedence(char ch) {
//         switch (ch) {
//             case '+':
//             case '-':
//                 return 1;
//             case '*':
//             case '/':
//                 return 2;
//             case '^':
//                 return 3;
//         }
//         return -1;
//     }

//     static String infixToPrefix(String exp) {

//         // Step 1: Reverse expression & swap brackets
//         StringBuilder reversed = new StringBuilder();
//         for (int i = exp.length() - 1; i >= 0; i--) {
//             char ch = exp.charAt(i);

//             if (ch == '(')
//                 reversed.append(')');
//             else if (ch == ')')
//                 reversed.append('(');
//             else
//                 reversed.append(ch);
//         }

//         // Step 2: Infix → Postfix
//         StringBuilder postfix = new StringBuilder();
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < reversed.length(); i++) {
//             char ch = reversed.charAt(i);

//             if (Character.isLetterOrDigit(ch)) {
//                 postfix.append(ch);
//             }
//             else if (ch == '(') {
//                 stack.push(ch);
//             }
//             else if (ch == ')') {
//                 while (!stack.isEmpty() && stack.peek() != '(') {
//                     postfix.append(stack.pop());
//                 }
//                 stack.pop();
//             }
//             else {
//                 while (!stack.isEmpty() &&
//                        precedence(stack.peek()) > precedence(ch)) {
//                     postfix.append(stack.pop());
//                 }
//                 stack.push(ch);
//             }
//         }

//         while (!stack.isEmpty()) {
//             postfix.append(stack.pop());
//         }

//         // Step 3: Reverse postfix → prefix
//         return postfix.reverse().toString();
//     }

//     public static void main(String[] args) {
//         String infix = "(A+B)*C";
//         System.out.println(infixToPrefix(infix));
//     }
// }




//evaluate postfix expression using stack

//IF OPERAND → PUSH
//IF OPERATOR → POP 2 ELEMENTS, EVALUATE OPERATION, PUSH RESULT BACK

//ex "231*+9-"  means: 2 3 1 * + 9 - : means 2 + (3 * 1) - 9 = -4



//appraoh  
//  1  Create a stack
//  2  Traverse string from left to right
//  3  If character is digit → push
//  4  If operator:
//  5  Pop b
//  6  Pop a
//  7  Compute (a op b)
//  8  Push result
//  9Final answer = top of stack


// import java.util.Stack;
// public class stack2 {
//     public static int evaluatePostfix(String exp) {
//         Stack<Integer> stack = new Stack<>();
//         for (int i = 0; i < exp.length(); i++) {
//             char ch = exp.charAt(i);
//             if (Character.isDigit(ch)) {
//                 stack.push(ch - '0'); // Convert char to int
//             } else {
//                 int b = stack.pop();
//                 int a = stack.pop();
//                 switch (ch) {
//                     case '+':
//                         stack.push(a + b);
//                         break;
//                     case '-':
//                         stack.push(a - b);
//                         break;
//                     case '*':
//                         stack.push(a * b);
//                         break;
//                     case '/':
//                         stack.push(a / b);
//                         break;
//                 }
//             }
//         }
//         return stack.pop();
//     }
//     public static void main(String[] args) {
//         String exp = "231*+9-";
//         System.out.println("Postfix Evaluation: " + evaluatePostfix(exp));
//     }
// }




//evaluate prefix expression using stack

//approach
// 1  create a stack
// 2 traverse the string from right to left
// 3  if character is digit → push
// 4  if operator:
// 5  pop a
// 6  pop b
// 7  compute (a op b)
// 8 push result
// 9 final answer = top of stack

// import java.util.Stack;
// public class stack2 {
//     public static int evaluatePrefix(String exp) {
//         Stack<Integer> stack = new Stack<>();

//         for (int i = exp.length() - 1; i >= 0; i--) {
//             char ch = exp.charAt(i);
//             if (Character.isDigit(ch)) {
//                 stack.push(ch - '0'); // Convert char to int
//             } else {
//                 int a = stack.pop();
//                 int b = stack.pop();
//                 switch (ch) {
//                     case '+':
//                         stack.push(a + b);
//                         break;
//                     case '-':
//                         stack.push(a - b);
//                         break;
//                     case '*':
//                         stack.push(a * b);
//                         break;
//                     case '/':
//                         stack.push(a / b);
//                         break;
//                 }
//             }
//         }
//         return stack.pop();
//     }
//     public static void main(String[] args) {
//         String exp = "-+2319";
//         System.out.println("Prefix Evaluation: " + evaluatePrefix(exp));
//     }
// }

