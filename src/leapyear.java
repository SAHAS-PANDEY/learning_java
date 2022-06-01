import java.util.*;
public class leapyear
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 10; i++)
        {
            System.out.println("enter year");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("yes it is leap year");
        }
        else if (year % 400 == 0)
        {
            System.out.println("yes it is leapyear");
        } else
            System.out.println("no it is not a leap year");
        }
    }
}
//my name is sahas
