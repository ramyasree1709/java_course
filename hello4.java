//check whether the person is dead or alive//

import java.util.Scanner;
class demo
{
    public static void main(String[] args)
    {
        Scanner ramya = new Scanner(System.in);
        String meghana = ramya.nextLine();
        if(meghana.equals("dead"))
        {
            System.out.println("Surya meets Ramya");
        }
        else
        {
            System.out.println("Surya weds meghana");
        }
        
    }
}