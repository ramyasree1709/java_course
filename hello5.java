//check whether the person is pass or fail//

import java.util.Scanner;
class demo
{
    public static void main(String args[])
    {
        Scanner ramya=new Scanner(System.in);
        int mark=ramya.nextInt();
        if(mark>35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
