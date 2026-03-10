import java.util.*;
class divisible5
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter number: ");
        int num=ob.nextInt();
        if(num%5==0)
            System.out.println(" Is the number "+num+" divisible by 5? Yes");
        else
            System.out.println(" Is the number "+num+" divisible by 5? No");
    }
}