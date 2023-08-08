import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        sc.close();
        s.toUpperCase();
        s=s.replace(" ", "");
        char c1[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            c1[i]=s.charAt(i);
        }
        int arr[]=new int[26];
        for(int i=0;i<c1.length;i++){
            arr[c1[i]-65]++;
        }
        boolean  a=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            a=true;
        }
        if(a==false)
            System.out.println("It's a pangram");
        else
            System.out.println("It's not a pangram");
    }
}