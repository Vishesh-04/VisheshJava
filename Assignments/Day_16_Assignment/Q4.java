import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String s = scanner.next();
        int c=0,v=0,sc=0;
        s=s.toLowerCase();
        scanner.close();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            v++;
            else if(Character.isLetter(ch))
            c++;
            else
            sc++;
        }
        System.out.println("No of Consonant "+c);
        System.out.println("No of Vowel "+v);
        System.out.println("No of Special Character "+sc);
    }    
}
