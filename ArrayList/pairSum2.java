package ArrayList;

import java.util.ArrayList;

public class pairSum2 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find the pivot (largest element)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // If pivot is not found, it means the array is not rotated (pivot is last index)
        if (pivot == -1) {
            pivot = n - 1;
        }

        // Left starts from the smallest element (pivot + 1), Right from the largest (pivot)
        int left = (pivot + 1) % n;
        int right = pivot;

        while (left != right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                return true;
            }

            // Move the left pointer to the right if sum is small
            if (sum < target) {
                left = (left + 1) % n;
            }
            // Move the right pointer to the left if sum is large
            else {
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16)); // Output: true
        System.out.println(pairSum(list, 60)); // Output: false
    }
}
