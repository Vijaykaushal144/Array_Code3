import java.util.Scanner;

public class Copy_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array =");
        int n=sc.nextInt();
        System.out.println("Enter the element of array=");
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for (int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }

}

