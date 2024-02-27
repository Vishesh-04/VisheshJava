import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0;
        System.out.println("Enter the Elements Of Array :- ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The Maximum Value of the Array is :- " + max);
    }
}