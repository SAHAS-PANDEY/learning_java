import java.util.Scanner;
public class lcm
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = Math.max(a, b);
        int y=a*b;
            int ans = x;
            for (int i = x; i <= y; i++)
            {
                if (i % a == 0 && i % b==0) {
                    ans = i;
                    break;
                }
            }
            System.out.println("LCM IS\t" + ans);
        }

}
//mai aur seekh liya
