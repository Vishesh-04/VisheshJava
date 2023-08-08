import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();
        sc.close();
        str=str.replace(" ","");
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        int a =1,l=0,p=0;
        for(int i = 0; i < str.length(); i++){
            int j;
            for(j = i+1; j < str.length(); j++){
                if(ch[i] == ch[j])
                {
                    a++;
                }
            }
            if(a>l){
                l=a;
                p=i;
                a=0;
            }
        }
        System.out.println(ch[p]+" is maximum occurring Character in String "+str);
    }
}