import java.util.Scanner;

public class Queue
{
    private int queue[];
    private int size;
    private int rear=-1;
    private int front =0;
    private Scanner sc=new Scanner(System.in);

    public Queue(int n)
    {
        queue=new int[n];
        size=queue.length;
    }
    public void insert()
    {
        int elem;
        if(rear==size-1)
        {
            System.out.println("Queue is Full! Insertion is not Possible");
        }
        else {
            System.out.println("Enter the element to insert");
            elem=sc.nextInt();
            ++rear;
            queue[rear]=elem;
        }
    }
    public void delete()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Deleted element is "+queue[front]);
            ++front;
        }
    }
    public void display()
    {
        if(front==-1 || front>rear)
        {
            System.out.println("queue is empty to display");
        }
        else{
            for(int i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
            System.out.println();

        }
    }
}
