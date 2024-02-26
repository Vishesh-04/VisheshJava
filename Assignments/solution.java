import java.util.*;
public class solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> A=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            ArrayList<Integer> B =new ArrayList();
            for(int j=0;j<a;j++){
                B.add(sc.nextInt());
            }
            A.add(B);
        }
        int index=sc.nextInt();
        for(int i=0;i<index;i++){
            int row=sc.nextInt();
            int col=sc.nextInt();
            try
       {
       System.out.println(A.get(row-1).get(col-1));
       }
      catch(Exception e)
      {
      System.out.println("ERROR!");
      }
        }
        sc.close();
    }
}