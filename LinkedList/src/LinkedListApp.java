import java.util.Scanner;

public class LinkedListApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Linked List");
        Scanner sc=new Scanner(System.in);
        LinkedList ll=new LinkedList();
        while (true)
        {
            System.out.println("Enter 1. For Insert at front");
            System.out.println("Enter 2. For Insert at rear");
            System.out.println("Enter 3. For Delete at front");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1 ->
                    ll.insertFront();
                case 2 ->
                    ll.inseatRear();
                case 3 ->
                    ll.deleteFront();
                default -> System.exit(0);
            }
        }


    }
}
