import java.util.Scanner;
class input {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter age");
        int a=sc.nextInt();
        System.out.println("name= "+name+" age= "+a);
    }
}
