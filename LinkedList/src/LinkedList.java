import java.util.Scanner;

public class LinkedList
{
    class Node {
        int data;
        Node link;
    }
    private Node first;
    private Scanner sc=new Scanner(System.in);

    public void insertFront()
    {
        Node front;
        System.out.println("Enter an Element");
        int elem=sc.nextInt();
        Node newnode=new Node();
        newnode.data=elem;
        newnode.link=null;
        if(first==null)
        {
            first=newnode;
        }
        else
        {
            newnode.link=first;
            first=newnode;
        }
    }

    public void inseatRear()
    {
        Node temp;
        System.out.println("Enter an element");
        int elem=sc.nextInt();
        Node newnode=new Node();
        newnode.data=elem;
        newnode.link=null;
        if(first==null)
        {
            first=newnode;
        }
        else {
            temp=first;
            while (temp.link!=null)
            {
                temp=temp.link;
            }
            temp.link=newnode;
        }
    }

    public void deleteFront()
    {
        Node temp;
        if(first==null)
        {
            System.out.println("Linked List is empty! Deletion Not Possible");
        }
        if(first.link==null)
        {
            System.out.println("Deleted element is "+first.data);
            first=null;
        }
        else
        {
            System.out.println("Deleted Element is "+first.data);
            first=first.link;
        }
    }

}
