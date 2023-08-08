package Assignments.Day_17_Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        StringBuffer s1 = new StringBuffer("Think Twice");
        StringBuffer s2 = new StringBuffer(s1.subSequence(0,5));
        StringBuffer s3 = new StringBuffer(s1.subSequence(6,11));
        s2.reverse();
        s3.reverse();
        System.out.println(s2+" "+s3);
    }
}