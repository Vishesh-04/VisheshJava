import java.util.*;
public class Q5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int l1=c1.length,l2=c2.length;
        for(int i=0;i<(l1-1);i++)
        {
            for (int j = 0; j < l1-1-i; j++)
            {
                if (c1[j] < c1[j+1])
                {
                    char temp=c1[j];
                    c1[j] = c1[j+1];
                    c1[j+1]=temp;
                }
            }
        }
        for(int i=0;i<(l2-1);i++)
        {
            for (int j = 0; j < l2-1-i; j++)
            {
                if (c2[j] < c2[j+1])
                {
                    char temp=c2[j];
                    c2[j] = c2[j+1];
                    c2[j+1]=temp;
                }
            }
        }
        if(Arrays.equals(c1,c2))
        System.out.println("It's a Anagram");
        else
        System.out.println("It's not a Anagram");
    }
}