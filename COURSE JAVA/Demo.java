// public class Demo {
//      public static void main(String args[]){
//         //repeat this statement until the condition is true as 4 times
//         //loop - while loop, do while loop, for loop, for each loop
//         // int i=5;

//         // while(i<=4)
//         //     {
//         //     System.out.println("hi" +i);
//         //     // int j=1;
//         //     // while(j<=3)
//         //     // {
//         //     //     System.out.println("hello" +j);
//         //     //     j++;
//         //     // }
//         //     i++;


//         // }   
//         // System.out.println("bye" +i);

//         // dowhile loop work below condition is true then it will execute the statement
//         // do{
//         //     System.out.println("hi" +i);
//         //     i++;
//         // }while(i<=6);{
//         //     System.out.println("bye" +i);

//         // }



//     }
// }



// public class Demo {
//     public static void main(String args[]){
//         //repeat this statement until the condition is true as 4 times
//         //loop - while loop, do while loop, for loop, for each loop

//         // for(int i=1; i<=4; i++) // increment the vlue of i by 1 as output will be hi1, hi2, hi3, hi4
//         // for(int i=4; i>=1; i--) // decrement the vlue of i by 1 as output will be hi4, hi3, hi2, hi1
//         for(int i=0; i<=7; i++) // increment the vlue of i by 1 as output will be hi0, hi1, hi2, hi3, hi4, hi5
//         {
//             System.out.println("DAY " + i);

//             for(int j=1; j<=9; j++) // increment the vlue of j by 1 as output will be hi1, hi2, hi3, hi4, hi5, hi6, hi7, hi8, hi9
//             {
//                 System.out.println("   " + (j+8) + "-" + (j+9));
//             }
//         }
//     }
// }


class Calculator
{
    int a;
    public int add()
    {
        System.out.println("  in Add");
        return 0;
    }
}

class Demo
{
    public static void main(String args[])
    {
        int num1=4;
        int num2=5;

        Calculator calc = new Calculator();
        int result = calc.add();
        // int result=num1+num2;

        System.out.println("The sum of two numbers is: " + result);
        
    }
}


//Obejct Oriented Programming (OOPs) - Java is an object oriented programming language. It is based on the concept of objects. It provides a clear structure for the programs and allows code to be reused, lowering development costs. The main principles of OOPs are:
//1. Inheritance
//2. Encapsulation
//3. Polymorphism


// Object - Property and behavior of an object is called as object. For example, a dog is an object. It has properties like color, breed, and behavior like barking, wagging tail, etc. In Java, an object is created from a class. A class is a blueprint for creating objects. It defines the properties and behaviors of an object.