import java.util.*;
class natural
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter number : ");
        int num=ob.nextInt();
        int sum=num*(num+1)/2;
        if(num>0)
            System.out.println("The sum of "+num+" natural numbers is "+sum);
        else
            System.out.println("The number "+num+" is not a natural number");
        }
}