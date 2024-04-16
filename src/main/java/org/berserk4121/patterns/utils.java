package org.berserk4121.patterns;

import java.util.Arrays;
import java.util.PriorityQueue;

class utils {

    public static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static int max(int[] nums) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static int min(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            res = Math.min(res, nums[i]);
        }
        return res;
    }

    public static int[] minmax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(max, nums[i]);
        }
        return new int[]{min, max};
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void p(int i){ System.out.println(i); }
    public static void p(char c){ System.out.println(c); }
    public static void p(long l){ System.out.println(l); }
    public static void p(boolean b){ System.out.println(b); }
    public static void p(int[] a) { System.out.println(Arrays.toString(a)); }
    public static void p(long[] a) { System.out.println(Arrays.toString(a)); }
    public static void p(boolean[] a) { System.out.println(Arrays.toString(a)); }
    public static void p(char[] a) { System.out.println(Arrays.toString(a)); }
    public static void p(int[][] m){ for(int[] a : m)  System.out.println(Arrays.toString(a)); }
    public static void p(char[][] m){ for(char[] a : m)  System.out.println(Arrays.toString(a)); }
    public static void p(long[][] m){ for(long[] a : m)  System.out.println(Arrays.toString(a)); }
    public static <T> void p(T a) { System.out.println(a); }
    public static <T> void p(T[] a) { System.out.println(Arrays.toString(a)); }
    public static <T> void p(T[][] m) { for(T[] a : m)  System.out.println(Arrays.toString(a)); }
    public static void p(PriorityQueue<int[]> pq){ for(int[] a : pq) p(a); }
    public static void p(){ System.out.println("---------------------------"); }
}
