import java.util.*;
class Array1
{
    public static void main(String[] args)
    {
        int a[]={10,7,47,23,11,20};
        int sum=0;
        for (int i=0;i<6;i++)
        {
            sum+=a[i];
            if(a[i]%2==0)
                a[i]=1;
            else
                a[i]=0;
            System.out.println(a[i]);
        }
        System.out.println("Sum of array = "+sum);
    }
}