import java.lang.System;
import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        Scanner ramya=new Scanner(System.in);
        int num1=ramya.nextInt();
        int num2=ramya.nextInt();
        {
        if(num1>num2){
            System.out.println("The greatest value is: "+num1);
        }
        else
        {
            System.out.println("The greatest value is: "+num2);
        }
        }
        {
        if(num1==num2)
        {
            System.out.println("Both numbers are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
        }
    }

}