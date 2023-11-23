import java.util.Scanner;

public class CircularQueue
{
    private int cq[];
    private int size;
    private int rear=-1;
    private int front=0;
    private int count=0;
    private Scanner sc=new Scanner(System.in);
    public CircularQueue(int n)
    {
        cq=new int[n];
        size=cq.length;
    }

    public void insert()
    {
        if(count==size)
        {
            System.out.println("Queue is Full! Insertion is not possible");
        }
        else
        {
            System.out.println("Enter an element");
            int elem=sc.nextInt();
            rear=(rear+1)%size;
            cq[rear]=elem;
            count++;
        }
    }
}
