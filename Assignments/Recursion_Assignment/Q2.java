import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int n = sc.nextInt();
        int s = sum(n, 0);
        System.out.println("The Result is :- "+s);
    }
    public static int sum(int n, int s) {
        if(n == 0)
        return s;
        else{
            if(n%2 == 0)
            s = s - n;
            else
            s = s + n;
            n=n-1;
            return sum(n ,s); 
        }
    }
}