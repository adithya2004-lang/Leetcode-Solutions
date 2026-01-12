import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // HashMap for storing number and index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Two Sum logic
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " " + i);
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("No solution found");
    }
}
//hi