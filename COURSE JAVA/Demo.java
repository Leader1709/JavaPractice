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


// class Calculator
// {
//     int a;
//     public int add(int n1, int n2)
//     {
//       int r=n1+n2;
//       return r;
//     }
// }

// class Demo
// {
//     public static void main(String args[])
//     {
//         int num1=4;
//         int num2=5;

//         Calculator calc = new Calculator();
//         int result = calc.add(num1, num2);
//         // int result=num1+num2;

//         System.out.println("The sum of two numbers is: " + result);
        
//     }
// }


//Obejct Oriented Programming (OOPs) - Java is an object oriented programming language. It is based on the concept of objects. It provides a clear structure for the programs and allows code to be reused, lowering development costs. The main principles of OOPs are:
//1. Inheritance
//2. Encapsulation
//3. Polymorphism


// Object - Property and behavior of an object is called as object. For example, a dog is an object. It has properties like color, breed, and behavior like barking, wagging tail, etc. In Java, an object is created from a class. A class is a blueprint for creating objects. It defines the properties and behaviors of an object.





// class computer
// {
//     public void playMusic()
//     {
//         System.out.println("Music is playing");
//     }

//     public String getMeAgain(int cost)
//     {

//         if (cost >= 10)
//         return "pen";
//     else
//         return "nothing";
//     }
// }

// class Demo
// {
//     public static void main(String args[])
//     {
//        computer obj = new computer();
//        obj.playMusic();
//        String str= obj.getMeAgain( 10);
//        System.out.println(str);     


//     }
// }


// class Calculator
// {
//     public int add( int n1,int n2)
//     {
//         return n1*n2;
//     }
//     public int add( int n1, int n2, int n3)
//     {
//         return n1+n2+n3;
//     }
//     public double add( double n1, double n2, double n3)
//     {
//         return n1+n2+n3;
//     }
// }

// class Demo
// {
//     public static void main(String args[])
//     {
//         Calculator obj = new Calculator();
//         double result = obj.add( 4.5, 5.5, 6.5 );
//         System.out.println( result);

//     }
// }



// class Calculator
// {
//     int num = 5;
//     public int add( int n1,int n2)
//     {
//         // System.out.println(num);
//         return n1+n2;
//     }

// }

// class Demo
// {
//     public static void main(String args[])
//     {
//         int data = 10;


//         Calculator obj = new Calculator();
//         Calculator obj1 = new Calculator();
//         int result = obj.add( 3, 4);
//         // System.out.println(result);

//         obj.num=8;
//         System.out.println(obj.num);
//         System.out.println(obj1.num);
//     }
// }



//Arrays - An array is a collection of similar type of data. It is a data structure that stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

// public class Demo
// {
//     public static void main(String args[])
//     {
//         // int arr[] = new int[5]; // declaration and instantiation of an array
//         // arr[0] = 10; // initialization of an array
//         // arr[1] = 20;
//         // arr[2] = 30;
//         // arr[3] = 40;
//         // arr[4] = 50;

//         // for(int i=0; i<arr.length; i++)
//         // {
//         //     System.out.println(arr[i]);
//         // }

//         // int nums[] = {1, 2, 3, 4, 5}; // declaration, instantiation and initialization of an array
//         // System.out.println(nums[2]); // accessing the third element of the array


//         int nums[] = new int[4]; // declaration and instantiation of an array
//         nums[0] = 4; // initialization of an array
//         nums[1] = 5;
//         nums[2] = 3;
//         nums[3] = 7;

//         for(int i=0; i<nums.length; i++)
//         {
//             System.out.println(nums[i]);
//         }

//         // System.out.println("The length of the array is: " + nums.length); // accessing the length of the array
//         // System.out.println("The first element of the array is: " + nums[0]);
//         // System.out.println("The second element of the array is: " + nums[1]);
//         // System.out.println("The third element of the array is: " + nums[2]);
//         // System.out.println("The fourth element of the array is: " + nums[3]);

//     }
// }


// public class Demo
// {
//     public static void main(String args[])
//     {
//         int nums[] [] = new int [3][4];

//         for (int i=0; i<3;i++)
//         {
//             for (int j=0; j<4; j++)
//             {
//                 nums[i][j] = (int)(Math.random()*10);
//             }
//         }


//         for (int i=0; i<3;i++)
//         {
//             for (int j=0; j<4; j++)
//             {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println(" ");
//         }
//         for(int n[] : nums)  //its called as for each loop, it is used to iterate through the elements of an array or a collection. It is a simpler way . its multi demensional array, so we have to use for each loop twice to iterate through the elements of the array.
//         {
//             for(int m : n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// public class Demo
// {
    // public static void main(String args[])
    // {
        // StringBuffer sb = new StringBuffer("Keerthi");
        // sb.append("gowda");
// 
        // sb.insert(6, "java "); // its a insert data off offset and string value
        // sb.setLength(30);  //set length add nullspace inoutput 
        // sb.ensureCapacity(0);
        // System.out.println(sb);
        // 
// 
// 
    // }
// }

// class human{
//     private int age;
//     private String name;
//     public int getAge() {
//         return age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }

    

// }


// class Demo
// {
//     public static void main(String args[]) 
//     {
//         human obj = new human();
//         obj.setAge(20);
//         obj.setName("keerthi");
//         System.out.println(obj.getName() + ":" + obj.getAge());
//     }
// }

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;
    
//     public void show()
//     {
//         System.out.println(brand + " " +price + " " + name);
//     }

// }


// public class Demo
// {
//     public static void main(String a[])
//     {
//         Mobile obj1=new Mobile();
//         obj1.brand="Apple";
//         obj1.price=5000;
//         obj1.name="smartphone";

//         Mobile obj2=new Mobile();
//         obj2.brand="Samsung";
//         obj2.price=4000;
//         obj2.name="smartphone";

//         Mobile.name="phone";

//         obj1.show();
//         obj2.show();
//     }
// }

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;
 
//     static
//     {
//            name="smartphone";
//            System.out.println("static block");
//     }

//     public Mobile()
//     {
//         brand="Apple";
//         price=7000;
//         System.out.println("constructor");
//     }


//     public void show()
//     {
//         System.out.println(brand + " " +price + " " + name);
//     }

// }

// public class Demo
// {
//     public static void main(String a[])
//     {
//         Mobile obj1 = new Mobile();
//         obj1.brand="Apple";
//         obj1.price=100;
//         Mobile.name="smartphone";

//         Mobile obj2 = new Mobile();
//         obj2.brand="Samsung";
//         obj2.price=1500;
//         Mobile.name="phone";


//         obj1.show();
//     }
// }



// class A
// {
//     public void show()
//     {
//         System.out.println("A is called");
//     }
// }

// public class Demo 
// {
    
//     public static void main(String args[])
//     {
//         A obj = new A();
//         obj.show();
//     }
// }

// class Calc
// {
//     public int add(int n1, int n2)
//     {
//         return n1+n2;
//     }
//     public int m(int n1, int n2)
//     {
//         return n1*n2;
//     }
// }

// class Demo
// {
//     public static void main(String args[])
//     {
//         Calc obj = new Calc();
//         int result = obj.add(4, 5);
//         System.out.println("The sum of two numbers is: " + result);

//         int result1 = obj.m(4, 5);
//         System.out.println("The product of two numbers is: " + result1);
//     }
// }


// class Demo
// {
//     public double power(int n1, int n2)
//     {
//         return Math.pow(n1, n2); // it will return the value of n1 raised to the power of n2
//     }
// }



// public class Demo
// {
//     public static void main(String args[])
//     {
//         Calc obj = new Calc();
//         int r1 = obj.add(4, 5);
//         int r2 = obj.sub(4, 5);
//         int r3 = obj.mul(4, 5);
//         int r4 = obj.div(4, 5);

//         System.out.println(r1 + " " + "The sum of two numbers is: " + r1);
//         System.out.println(r2 + " " + "The difference of two numbers is: " + r2);
//         System.out.println(r3 + " " + "The product of two numbers is: " + r3);
//         System.out.println(r4 + " " + "The quotient of two numbers is: " + r4);
//     }
// }



// class a
// {
//     public a()
//     {
//         super(); // Calls the constructor of the Object class
//         System.out.println("a is called");
//     }
    
// }

// class b extends a
// {
//     public b()
//     {
//         super(); // Calls the constructor of class a
//         System.out.println("b is called");
//     }
// }

// class Demo
// {
//     public static void main(String args[])
//     {
        
//         b obj = new b( ); // it will call the constructor of class b and then the constructor of class a
//     }
// }

// class Laptop
// {
//     String model;
//     int price;
    

//     public String toString()
//     {
//         return  model + ", Price: " + price;
//     }

//     public boolean equals(Laptop that)
//     {
//         if (this.model.equals(that.model) && this.price == that.price)
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
// }

// public class Demo
// {
//     public static void main(String args[])
//     {
//         Laptop obj1 = new Laptop();
//         obj1.model = "Dell";
//         obj1.price = 1000;
//         System.out.println(obj1);
//     }
// }


// dowm costing

// class A
// {
//     public void show1()
//     {
//         System.out.println("A is called");
//     }

// }
// class B extends A
// {
//     public void show2()
//     {
//         System.out.println("B is called");
//     }

// }


// public class Demo
// {
//     public static void main(String args[])
//     {
//          B obj = new B();
//         obj.show1();

//         B obj1 = (B) obj; // downcasting
//         obj1.show2();
//     }
// }




//  abstract class car
// {

//     public abstract void drive();
//     public abstract void fly();
//     public void playMusic()
//     {
//         System.out.println("Playing music");
//     }
// }

// class Mustang extends car
// {
//     public void drive()
//     {
//         System.out.println("Driving Mustang");
//     }
// }

// class UpdatedMustang extends Mustang
// {
//     public void fly()
//     {
//         System.out.println("Flying Mustang");
//     }
// }


// public class Demo
// {
//     public static void main(String args[])
//     {
//         car obj = new UpdatedMustang();
//         obj.drive();
//         obj.playMusic();
//         obj.fly();
//     }
// }


// inner class - A class defined within another class is called an inner class. An inner class can access the members of the outer class, including private members. Inner classes are used to logically group classes that are only used in one place, increase encapsulation, and can lead to more readable and maintainable code.


// class A
// {
//     int age;  // outer class can access the members of the inner class, but it cannot access the private members of the inner class

//     public void show()
//     {
//         System.out.println("is show");    // outer class can access the members of the inner class, but it cannot access the private members of the inner class
//     }

//     class B   // inner class
//     {
//         public void config()  // inner class can access the members of the outer class, including private members
//         {
//             System.out.println("is config");
//         }
//     }
// }



class A
{
    public void show()
    {
        System.out.println("is show");    // outer class can access the members of the inner class, but it cannot access the private members of the inner class
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("is show");    // outer class can access the members of the inner class, but it cannot access the private members of the inner class
    }
}

// class Demo
// {
//     public static void main(String args[])
//     {
//         A obj = new A();       // creating an object of the outer class A
//         obj.show();    // calling the method of the outer class A

//         B obj1 = new B();   // creating an object of the inner class B using the object of the outer class A
//         obj1.show();  // calling the method of the inner class B
//     }
// }


class Demo
{
    public static void main(String args[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("is show");    // outer class can access the members of the inner class, but it cannot access the private members of the inner class
            }   
        };
        obj.show();    // calling the method of the outer class A
        // annonymous class - A class without a name is called an anonymous class. It is used to override the method of a class or an interface. It is used to create an object of a class without creating a separate class. It is used to create an object of a class that has only one method. It is used to create an object of a class that has only one method and that method is overridden.
    }
}