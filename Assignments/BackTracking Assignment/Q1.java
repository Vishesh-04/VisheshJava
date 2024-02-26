import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

    }
    public static boolean canPartition(int []arr, int k, int n) {
        int []vis = new int[n];
        Arrays.fill(vis, -1);
        int sum=0;
        for(int i=0;i<n;i++)
        sum+=arr[i];
       
        if(sum%k!=0)
        return false;
        return helper(arr,vis,0,0,sum/k,k);
    }
    public static boolean helper(int []arr , int []vis , int si , int curr_sum , int target , int k)
    {
        if(k==1)return true;
        if(curr_sum>target) return false;
        if(curr_sum==target)return helper(arr,vis,0,0,target,k-1);

        for(int i=si;i<arr.length;i++){
            if(vis[i]==-1){
                vis[i]=1;
                if(helper(arr,vis,i+1,curr_sum+arr[i],target,k) == true)return true;
                vis[i]=-1;
            }
        }
        return false;
    }
}