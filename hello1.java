import java.lang.System;
import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        Scanner ramya=new Scanner(System.in);
        String name=ramya.nextLine();
        float score=ramya.nextFloat();
        ramya.nextLine();
        String department=ramya.nextLine();
        System.out.println("My name is "+name);
        System.out.println("My score is "+(score/10));
        System.out.println("My department is "+department);
    }
}