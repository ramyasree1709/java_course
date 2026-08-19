
//to get a input from user then pass to parameter then result should return to the main function//


import java.util.Scanner;
public class school
{
String passorfail(int mark)
{
    if(mark>=35)
    {
        return "pass";
    }
    else
    {
        return "fail";

    }
    
}
public static void main(String args[])
{
    Scanner ramya=new Scanner(System.in);
    int total_mark=ramya.nextInt();
    school obj=new school();
    String result=obj.passorfail(total_mark);
    System.out.println(result);
}
}