import java.util.*;
import java.lang.*;

public class Days
{
public static void main(String[] args)
{
    int day;
    Scanner S=new Scanner(System.in);
    System.out.print("\n Enter number of day: ");
    day=S.nextInt();

    if(day==1)
    {
        System.out.println("\n Monday");
    }
    else if(day==2)
    {
        System.out.println("\n Tuesday");
    }
    else if(day==3)
    {
        System.out.println("\n Wednesday");
    }
    else if(day==4)
    {
        System.out.println("\n Thursday");
    }
    else if(day==5)
    {
        System.out.println("\n Friday");
    }
    else if(day==6)
    {
        System.out.println("\n Saturday");
    }
    else if(day==7)
    {
        System.out.println("\n sunday");
    }
    else
    {
        System.out.println("\n Invalid day number.");

    }
     }
}