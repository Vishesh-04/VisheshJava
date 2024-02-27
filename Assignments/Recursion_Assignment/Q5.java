import java.util.*;
public class Q5 {
    static int sum=0;
	public static int check_ArmstrongNumber(int num)
	{
        if(num!=0)
		{
            sum+=Math.pow(num%10,3);
			check_ArmstrongNumber(num/10);
		}
		return sum;
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        if(check_ArmstrongNumber(n)==n)
        System.out.print(n+" is an Armstrong Number.");
        else
        System.out.print(n+" is not an Armstrong Number.");
        sc.close();
	}
}