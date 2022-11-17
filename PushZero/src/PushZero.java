import java.io.*;
import java.util.Scanner;


public class PushZero
{
    static void pushZerosToEnd(int arr[], int n)
    {
        int count=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=0)
            {
                swap(arr, i, count);
                count++;
            }
        }
        System.out.println("Transformiranata niza e:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int[] array, int I, int J) {
        int temp=array[I];
        array[I]=array[J];
        array[J]=temp;
    }

    public static void main (String[] args)
    {
        int arr[] = new int[100];
        int n;
        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();
        for(int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        pushZerosToEnd(arr, n);

    }
}