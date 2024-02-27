import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n = sc.nextInt();
        int s = sum(n);
        System.out.println("The Sum of Digits is :- "+s);
    }
    public static int sum (int n){
        if(n<=0){
            return 0;
        }
        int s = 0;
        s = s + (n % 10) + sum(n/10);
        return s;
    }
}
