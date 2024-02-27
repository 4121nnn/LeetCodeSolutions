package org.berserk4121;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 1000000;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            int r = random.nextInt(n);
            nums[i] = r;
        }
        int[] nums2 = Arrays.copyOf(nums, n);
        int[] nums3 = Arrays.copyOf(nums, n);


        long startTime = System.nanoTime(); // Capture the start time
        long result = largestPerimeter(nums2); // Call the method whose execution time you want to measure
        long endTime = System.nanoTime(); // Capture the end time
        double elapsedTime = (endTime - startTime) / 1e6; // Calculate the elapsed time in nanoseconds
        System.out.print("n^2 solution : " + elapsedTime + " ms. ");
        System.out.println("Result: " + result); // Print the result
        startTime = System.nanoTime(); // Capture the start time
        result = largestPerimeter2(nums3); // Call the method whose execution time you want to measure
        endTime = System.nanoTime(); // Capture the end time
        elapsedTime = (endTime - startTime) / 1e6; // Calculate the elapsed time in nanoseconds
        System.out.print("nlogn solution: " + elapsedTime + " ms. ");
        System.out.println("Result: " + result); // Print the result

    }
    public static long largestPerimeter(int[] nums) {
        return find(nums, nums.length);
    }
    public static long largestPerimeter2(int[] nums) {
        Arrays.sort(nums);
        long sum = nums[0] + nums[1];
        long res = -1;
        for(int i = 2; i< nums.length; i++){
            if(nums[i] < sum){
                res = sum + nums[i];
            }
            sum += nums[i];

        }
        return res;
    }
    public static long find(int[] nums, int end){
        long sum = 0;
        int maxInd = 0;
        for(int i = 0; i < end; i++){
            sum += nums[i];
            if(nums[i] > nums[maxInd]) maxInd = i;
        }
        if(sum - nums[maxInd] > nums[maxInd]){
            return sum;
        }else{
            if(end < 3) return -1;
            nums[maxInd] = nums[end-1];
            return find(nums, end-1);
        }
    }
}
