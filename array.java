//array in java....get a 5 numbers and display total using array//
import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        int[] num=new int[5];
        Scanner ramya = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        num[0]=ramya.nextInt();
        num[1]=ramya.nextInt();
        num[2]=ramya.nextInt();
        num[3]=ramya.nextInt();
        num[4]=ramya.nextInt();
        int sum=num[0]+num[1]+num[2]+num[3]+num[4];
        System.out.println("sum "+sum);
    }
}



