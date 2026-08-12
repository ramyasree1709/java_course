//check the student pass or fail..if pass he get scolorship or not using nestedif condition//

import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        int mark = ramya.nextInt();
        if(mark>50)
        {
        System.out.println("pass");
        if(mark>80)
        {
            System.out.println("get scolorship");
        }
        else
        {
            System.out.println("you dont get scolorship");
        }

        }
        else
        {
            System.out.println("fail");
        }
    }
}
       