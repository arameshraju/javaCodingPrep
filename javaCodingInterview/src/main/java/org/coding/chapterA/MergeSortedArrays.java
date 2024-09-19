import java.util.Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the end of the initial elements in nums1
        int j = n - 1; // Pointer for the end of nums2
        int k = m + n - 1; // Pointer for the end of nums1's total length

        // Merge in reverse order
//        1, 2, 3, 0, 0, 0
//        1, 5, 6
//        1, 2, 3, 1, 5, 6

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy remaining elements of nums2 if any
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArrays merger = new MergeSortedArrays();

        System.out.println("Use case 1");
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 5, 6};
        int n = 3;
        merger.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Expected Output: [1, 2, 2, 5, 6, 9]

        System.out.println("Use case 2");
        int[] nums21 = {9}; // Ensure nums21 has space to accommodate merged elements
        int m2 = 1;
        int[] nums22 = {}; // nums22 is empty
        int n2 = 0;
        merger.merge(nums21, m2, nums22, n2);
        System.out.println(Arrays.toString(nums21)); // Expected Output: [9]

        System.out.println("Use case 3");
        int[] nums31 = {0}; // Ensure nums31 has space to accommodate merged elements
        int m3 = 0;
        int[] nums32 = {8}; // nums32 has one element
        int n3 = 1;
        merger.merge(nums31, m3, nums32, n3);
        System.out.println(Arrays.toString(nums31)); // Expected Output: [8]
    }
}
