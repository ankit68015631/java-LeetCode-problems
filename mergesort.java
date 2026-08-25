


public class mergesort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 6, 2, 1};

        divide(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void divide(int[] nums, int si, int en) {
        if (si >= en) {
            return;
        }

        int mid = si + (en - si) / 2;
        divide(nums, si, mid);
        divide(nums, mid + 1, en);
        conquer(nums, si, mid, en);
    }

    public static void conquer(int[] nums, int si, int mid, int en) {
        int[] merged = new int[en - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= en) {
            if (nums[idx1] <= nums[idx2]) {
                merged[x++] = nums[idx1++];
            } else {
                merged[x++] = nums[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = nums[idx1++];
        }

        while (idx2 <= en) {
            merged[x++] = nums[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            nums[j] = merged[i];
        }
    }
}

