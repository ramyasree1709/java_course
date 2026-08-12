import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        int mark = ramya.nextInt();
        if(mark>90)
        {
            System.out.println("macbook pro");

        }
        else if(mark>60)
        {
            System.out.println("Iphone");
        }
        else if(mark>35)
        {
            System.out.println("video game");
        }
    }
}
       