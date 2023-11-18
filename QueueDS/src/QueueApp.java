import java.util.Scanner;

public class QueueApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Queue DataStructure");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Queue size");
        int n=sc.nextInt();

        Queue q=new Queue(n);
        while (true)
        {
            System.out.println("Enter 1. for Insert");
            System.out.println("Enter 2. for Delete");
            System.out.println("Enter 3. for Display");
            System.out.println("Enter any key to Exit");
            System.out.println("Select Your Choice");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    q.insert();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
