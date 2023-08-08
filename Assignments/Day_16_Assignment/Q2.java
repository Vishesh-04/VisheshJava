//WAP to print Duplicates characters from the String
import java.util.*;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        sc.close();
        char str[]=s.toCharArray();
        int l= str.length;
        for (int i = 0; i < l; i++)
        {
            int j;
            for (j = i+1; j < l; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j != l)
            {
                System.out.println(str[j]);
            }
        }
        
    }
}
