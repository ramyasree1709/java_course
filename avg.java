//check the average mark of 5 sub then using elseif condition //

import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        int m1 = ramya.nextInt();
        int m2 = ramya.nextInt();
        int m3 = ramya.nextInt();
        int m4 = ramya.nextInt();
        int m5= ramya.nextInt();
        int avg=(m1+m2+m3+m4+m5)/5;
        System.out.println("ur average mark is "+avg);
        if(avg<35)
        {
            System.out.println("additional class is required");

        }

        else
        {
            System.out.println("you are good to go");
        }
    }
}
       