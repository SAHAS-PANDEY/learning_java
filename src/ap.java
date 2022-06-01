import java.util.Scanner;
public class ap {
    public static int nthterm(int a,int d,int n)
    {
        int ans=a+(n-1)*d;
        return ans;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a,d,n");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(nthterm(a,d,n));
        //test comment

    }
}
