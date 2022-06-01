import java .util.*;
public class arrayintro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of element in an array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        boolean distinct=true;
        int c=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=(i-1);j>=0;j--)
            {
               if(arr[i]==arr[j])
               {
                   distinct=false;
                   break;
               }
            }
            if(distinct==true)
                c++;
        }
        System.out.println(c);

    }
}






