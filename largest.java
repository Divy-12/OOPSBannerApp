import java.util.*;
class largest
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter 3 numbers : ");
        int num1=ob.nextInt();
        int num2=ob.nextInt();
        int num3=ob.nextInt();
        if (num1>=num2 && num1>=num3)
            System.out.println("Is the first number the largest? Yes");
        else
            System.out.println("Is the first number the largest? No");
        if(num2>=num1 && num2>=num3)
            System.out.println("Is the second number the largest? Yes");
        else
            System.out.println("Is the second number the largest? No");
        if(num3>=num2 && num3>=num1)
            System.out.println("Is the Third number the largest? Yes");
        else
            System.out.println("Is the Third number the largest? No");
        }
}