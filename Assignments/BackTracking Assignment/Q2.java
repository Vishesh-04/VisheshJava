import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter Elements of Array");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        permute(A);
    }
    public static void permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
          return;
        }

        permutationsHelper(result, nums, 0);
        
        for(List<Integer> list : result){
            for(Integer item : list){
                System.out.print(item + "  ");
            }
            System.out.println("");
        }
    }
    private static void permutationsHelper(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int n : nums) {
                list.add(n);
            }
            result.add(list);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permutationsHelper(result, nums, start + 1);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int x, int y) {
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }
}
