public class Q3 {
    public static void main(String[] args){
        StringBuffer sc=new StringBuffer("2552");
        StringBuffer sc1=new StringBuffer();
        sc1=sc.reverse();
        if(sc1.compareTo(sc)==0)
        System.out.println(sc+" is Palindrome ");
        else
        System.out.println(sc+" is not Palindrome ");
    }
}
