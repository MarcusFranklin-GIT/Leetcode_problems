import java.util.*;
public class Sliding_Window_Maximum_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int result[] = new int[len - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();
        int ptr = 0;

        for (int i = 0; i < len; i++) {
            if (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                result[ptr++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }
}