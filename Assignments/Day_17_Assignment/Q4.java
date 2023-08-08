package Assignments.Day_17_Assignment;
import java.util.*;
public class Q4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.next();
        s=s.replace(" ", "");
        int l=s.length();
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        for(int i=0; i<ch.length; i++){
            System.out.println(ch[i]);
        }
    }
}
