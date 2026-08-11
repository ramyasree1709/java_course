import java.lang.System;
import java.util.Scanner;
class hello
{
    public static void main(String args[])
    {
        Scanner ramya=new Scanner(System.in);
        int a=ramya.nextInt();
        int b=ramya.nextInt();
        int c=ramya.nextInt();
        int d=a*b*c;
        int e=a+b+c;
        int f=d/e;
        System.out.print("The value is "+f);
      
    }
}