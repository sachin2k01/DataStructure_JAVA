import java.util.Scanner;

public class ArrayApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int len=sc.nextInt();
        array a=new array(len);

        while(true)
        {
            System.out.println("Enter 1 for inserting");
            System.out.println("Enter 2 for deleting");
            System.out.println("Enter 3 for display");
            System.out.println("Enter any key exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    a.insert();
                    break;
                case 2:
                    a.delete();
                    break;
                case 3:
                    a.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}

class array
{
    private int arr[];
    public Scanner sc=new Scanner(System.in);

    public array(int n)
    {
        arr=new int[n];
    }
    public void insert()
    {
        System.out.println("enter the position for 0 to "+(arr.length-1));
        int pos=sc.nextInt();

        System.out.println("enter the element to insert");
        int elem=sc.nextInt();

        arr[pos]=elem;
    }

    public void delete()
    {
        System.out.println("enter the position to delete the element");
        int pos=sc.nextInt();

        System.out.println("deleted element is"+arr[pos]);
        arr[pos]=0;
    }

    public void display()
    {
        System.out.println("Array elements are: ");
        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println();
    }
}

