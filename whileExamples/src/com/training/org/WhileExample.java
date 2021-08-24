package com.training.org;
import java.util.Scanner;
public class WhileExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String message=input.nextLine();
        String replaceString="";
        int i=0;
        while(i<message.length()){
            if(message.charAt(i)=='a')
                replaceString+='#';
            else
                replaceString+=message.charAt(i);
            i++;
        }
        System.out.println("Replaced String "+replaceString);



//        String message="JAVA programming";
//        String reversedString="";
//        int i=message.length()-1;
//        do{
//            reversedString+=message.charAt(i);
//            i--;
//        }while (i>=0);
//
//        System.out.println("Reversed String "+reversedString);
//


//
//        String name[]={"Chiku","Annu","Mannnu","Chintu","Pappu"};
//        String message="Hello World";
//        int []numbers={10,20,30,40,50};
//
//        for (int i=0;i<numbers.length;i++)
//            System.out.println(numbers[i]);


        //        for(int num:numbers)
//            System.out.println(num);

//        for(String str:name)
//            System.out.println(str);
//
//        for(char ch:message.toCharArray())
//            System.out.println(ch);




//        for(int i=10;i>=0;i--)
//            System.out.println("Value of i "+i);


//        int i=0;
//        for(;i<=10;){
////            if(i>10){
////                break;
////            }
//            System.out.println("Value of i"+i);
//            i++;
//        }


//        for (int i =0;i<=10;i++)
//            System.out.println("Value of i"+i);
//
//



//        int i=0;
//        do{
//            if(i%2==0)
//                System.out.println("Even no"+i);
//            i++;
//        } while(i<=50);



//        Scanner input=new Scanner(System.in);
//
//        char ch;
//
//
//        int choice;
//        do{
//            System.out.println("Enter first number");
//            int num1=input.nextInt();
//
//            System.out.println("Enter second number");
//            int num2=input.nextInt();
//
//            System.out.println("1] Addition\n2] Subtraction\n3] Multiplication\n4] Division\n\nEnter your choice\n");
//            choice=input.nextInt();
//
//            switch (choice){
//                case 1:
//                    System.out.println("Addition -> "+(num1+num2));
//                    break;
//
//                case 2:
//                    System.out.println("Subtraction -> "+(num1-num2));
//                    break;
//                case 3:
//                    System.out.println("Multiplication -> "+(num1*num2));
//                    break;
//                case 4:
//                    System.out.println("Division -> "+(float)(num1/(float)num2));
//                    break;
//            }
//
//            System.out.println("Do you want to continue....");
//            ch=input.next().charAt(0);
//
//        }while(ch=='Y'||ch=='y');




//        int i=0;
//        do{
//            System.out.println("Value of i "+i);
//            i++;
//        }while(i<=10);



//
//        int sum=0;
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter number of iterations");
//        int number=input.nextInt();
//
//        while(number>=0){
//            sum+=number;
//            number--;
//        }
//
//        System.out.println("sum of elements "+sum);



//
//            int i=10;
//            while (i>=0){
//                System.out.println("Value of i"+i);
//                i--;
//            }



  //      System.out.print("Printing.");
//        while(true){
//            System.out.print("..");
//        }


//        int i=0;  //initialization
//        while(i<=10){    //condition
//            System.out.println("Value of i "+i);
//            i+=2;  //increment
//        }
    }
}
