//create 4 arithmetic functions getting input value from main function(parameter//) 

public class arithfun
{
    void add(int a,int b)
    {
        int addition=a+b;
        System.out.println(addition);
    }
    void multi(int a,int b)
    {
        int multiplication=a*b;
        System.out.println(multiplication);
    }
    void div(int a,int b)
    {
        int division=a/b;
        System.out.println(division);
    }

    void sub(int a,int b)
    {
        int subtraction=a-b;
        System.out.println(subtraction);
    }

    public static void main(String args[])
    {
        arithfun obj=new arithfun();
        obj.add(5,10);
        obj.div(50,10);
        obj.sub(15,10);
        obj.multi(5,10);
        

    }
}