import java.util.Scanner;

public class CircularQueueApp
{
    public static void main(String[] args) {
        System.out.println("Welcome To CircularQueue DataStructure");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Queue size");
        int n=sc.nextInt();

        CircularQueue cq=new CircularQueue(n);
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
                    cq.insert();
                    break;
                case 2:
                    cq.Deque();
                    break;
                case 3:
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
