// using ternary opertor//


import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=ramya.nextInt();
        System.out.println("Enter second number:");
        int num2=ramya.nextInt();
        String result=num1>num2? "num1 is greatest":"num2 is greatest" ;
        System.out.println(result);
    }
}
