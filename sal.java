// compare salary using nestef if//


import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        System.out.println("Enter ur salary");
        int salary = ramya.nextInt();
        System.out.println("Enter ur age");
        int age=ramya.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.println("moving to loan part");
            System.out.println("how much loan do you need?");
            int loan = ramya.nextInt();
            if(loan<=50000)
            {
                System.out.println("ur ellible for loan");
            }
            else if(loan>=50000)
            {
                System.out.println("Maximum loan amount is 50000");

            }

        }
        else
        {
            System.out.println("ur not elligible for loan");
        }
    }
}
       
