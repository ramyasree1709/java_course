
//using class and object in java//
public class phone
{
    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String args[])
    {
        phone ph1=new phone();
        ph1.name="samsung";
        ph1.proc ="dd";
        ph1.ram=23;
        ph1.price=60000;

        phone ph2=new phone();
        ph2.name="vivo";
        ph2.proc ="uyt";
        ph2.ram=9;
        ph2.price=25000;

        System.out.println(ph2.name);
        System.out.println(ph1.ram);
        

    }
}
