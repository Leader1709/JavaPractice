// class hello
// {
//     public static void main(String args[])
//     {
//         // int num1 = 5;
//         // byte num2 = 10;
//         // short sh=558;
//         // long l=5845;

//         // float f=5.5f;
//         // double d=5.5;

//         // char c= 'k';

//         // boolean b=true;
//         // int result=num1+num2;
//         // System.out.println(result);
//         // System.out.println(4+5);
//         // System.out.println("Hello World");

//         //literals 
//         // int num1 = 10000_0001;

//         // char c='k';
//         // c++;

//     //    // type casting converting one data type into another data type
//     //     byte b = 127;
//     //     int a =b;  //its convert byte into int automatically....
//     //     System.out.println(b);
//     //     System.out.println(a);

//         // // its type casting converting one data type into another data type
//         // //its convert int into byte manually....
//         // // its called explicit type casting
//         // int a =257;
//         // byte b = (byte) a; //its convert int into byte manually....
//         // System.out.println(b);

//         // // float cost convertion into int value
//         // float f= 5.7f;
//         // int a= (int) f;
//         // System.out.println(a);

//     }
// }

/**
 * hello
 */
// public class hello {

//     public static void main(String args[])
//      {
//         int num1=7;

//         // int num2=3;
//         // int result = num1 + num2;
//         // int result = num1 - num2;
//         // int result = num1 * num2;
//         // int result = num1 / num2;
//         // int result = num1 % num2;

//         // num1 += 3; // num1=num1+3; thi also called compound assignment operator
//         // ++num1; // num1=num1+1; //increment operator its pre increment operator
//         // --num1; // num1=num1-1; //decrement operator its pre decrement operator
//         // num1--; // num1=num1-1; //decrement operator its post decrement operator
//         // num1++; // num1=num1+1; //increment operator its post increment operator

//         int result = num1 +1; // fetch the value of num1 and then add 1 to it and store it in result variable
//         // int result = ++num1; // increment the value of num1 by 1 and then fetch the value of num1 and store it in result variable
//         System.out.println(result);

//     }
// }

//  class hello{
//      public static void main(String args[] ){

//             // int x=6;
//             // int y=5;
        
//             double x=6.5;
//             double y=5.5;
//             boolean result = x < y || x > y;  // its called relational operator give given the boolean value true or false if number is greater than or not its give output true or false
//             System.out.println(!result);
//      }
//  }


// class hello{
//     public static void main (String args[]){
//         // int x=8;

//         // if(x<5){
            
//         //     System.out.println("Hello");
//         // }
//         // else{
//         //     System.out.println("bye");
//         // }
        
//         // System.out.println(x);
//         // System.out.println("hello");


//         // int x=8;
//         // int y=10;

//         // if(x<y){
//         //     System.out.println("x is less than y");
//         // } else{
//         //     System.out.println("y is greater than x");
//         // }


//         // if , if else, if else if else , else if ladder, nested if else, switch case
//         int n=5;
//         int result=0;

//         // if(n%2==0)
//         //     result=10;
//         // else
//         //     result=20;

//         //?;

//         result = (n%2==0) ? 10 : 20; // its called ternary operator its used to write if else statement in single line
//         System.out.println(result);
//     }
// }




// its switch case its used to write if else statement in single line and its used to write multiple if else statement in single line then its a case breake condtions use in this switch case statement if we not use break statement then it will execute all the cases after the matching case and its called fall through condition

// class hello{
//     public static void main(String args[]){

        
//         int n=1;

//         switch(n){
//             case 1:
//                 System.out.println("monday");
//                 break;
//             case 2:
//                 System.out.println("tuesday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("thursday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("saturday");
//                 break;
//             case 7:
//                 System.out.println("sunday");
//                 break;
//         }
//         // if(n==1)
//         //     System.out.println("monday");
//         // else if(n==2)
//         //     System.out.println("tuesday");
//         // else if(n==3)
//         //     System.out.println("wednesday");
//         // else if(n==4)
//         //     System.out.println("thursday");
//         // else if(n==5)
//         //     System.out.println("friday");
//         // else if(n==6)
//         //     System.out.println("saturday");
//         // else if(n==7)
//         //     System.out.println("sunday");
//         // else
//         //     System.out.println("invalid input");
//     }
// }


// its called while loop its used to execute a block of code repeatedly until a specified condition is true
