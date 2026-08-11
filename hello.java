import java.lang.System;
import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        Scanner ramya=new Scanner(System.in);
        String name=ramya.nextLine();
        int age=ramya.nextInt();
        ramya.nextLine();
        String address=ramya.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My address is "+address);
    }
}