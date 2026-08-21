//sliding window technique

public class slidingwindow {


    // Function to find the maximum sum of a subarray of size k
    public int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1; // Not enough elements for the window
        }

        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

        int windowSum = maxSum;

        for (int right = k; right < n; right++) {
            windowSum += arr[right];       // add new element
            windowSum -= arr[right - k];   // remove old element

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }




    //for variable size of window : length if min subarray with sum greater than x

    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int left = 0, sum = 0, minLength = Integer.MAX_VALUE;
        

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum >= s) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    



    public static void main(String[] args) {
        slidingwindow sw = new slidingwindow();
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 5};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + sw.maxSum(arr, k));



        int targetSum = 7;
        System.out.println("Minimum length of a subarray with sum >= " + targetSum + " is: " + sw.minSubArrayLen(targetSum, arr));
    }

    
}