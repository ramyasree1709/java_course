//check the ur game is good or excellent or improve based on ur score using nestedif //

import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        int score = ramya.nextInt();
        if(score<50)
        {
            System.out.println("you need to improve");

        }
        else if(50<score && score<=70)
        {
            System.out.println("good job");
        }
        else if(score>70)
        {
            System.out.println("excellent performance");
        }
    }
}
       