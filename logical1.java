//check whether the number is divide by 3 and 5//

import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        int num = ramya.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("divide");

        }
        else
        {
            System.out.println("not divide");
        }
    }
}
       