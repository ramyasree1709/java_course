//array in java....get a 5 numbers and display total using array//
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        int[] mark=new int[5];
        for(int i=0;i<=4;i++)
        {
            mark[i]=ramya.nextInt();
        }
       
       for(int i=0;i<=4;i++)
       {
        System.out.println(mark[i]);
       }
        
        int sum=mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
        System.out.println("sum "+sum);
    }
}




