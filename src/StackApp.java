import java.util.Scanner;

public class StackApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the stack size");
        int len=sc.nextInt();
        Stack s=new Stack(len);

        while(true)
        {
            System.out.println("enter 1 for.......Push");
            System.out.println("enter 2 for.......Pop");
            System.out.println("enter 3 for.......Display");
            System.out.println("enter any key to exit");
            System.out.println("enter your choice");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

class Stack
{
    private int stack[];
    private int size;
    private int top=-1;
    private Scanner sc=new Scanner(System.in);

    public Stack(int n)
    {
        stack=new int[n];
        size=stack.length;
    }

    public void push()
    {
        int elem;
        if(top==size-1)
        {
            System.out.println("push is not possible");
        }
        else
        {
            System.out.println("enter an element");
            elem=sc.nextInt();
            ++top;
            stack[top]=elem;
        }
    }
    public void pop()
    {
        if(top==-1)
        {
            System.out.println("pop is not possible");
        }
        else
        {
            System.out.println("the element deleted is"+stack[top]);
            --top;
        }
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
}
