package org.berserk4121.patterns;

public class utils {

    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }


    public void p(int i){ System.out.println(i); }
    public void p(char c){ System.out.println(c); }
    public void p(long l){ System.out.println(l); }
    public void p(boolean b){ System.out.println(b); }
    public void p(int[] a) { System.out.println(Arrays.toString(a)); }
    public void p(long[] a) { System.out.println(Arrays.toString(a)); }
    public void p(boolean[] a) { System.out.println(Arrays.toString(a)); }
    public void p(char[] a) { System.out.println(Arrays.toString(a)); }
    public void p(int[][] m){ for(int[] a : m)  System.out.println(Arrays.toString(a)); }
    public void p(char[][] m){ for(char[] a : m)  System.out.println(Arrays.toString(a)); }
    public void p(long[][] m){ for(long[] a : m)  System.out.println(Arrays.toString(a)); }
    public <T> void p(T a) { System.out.println(a); }
    public <T> void p(T[] a) { System.out.println(Arrays.toString(a)); }
    public <T> void p(T[][] m) { for(T[] a : m)  System.out.println(Arrays.toString(a)); }
    public void p(PriorityQueue<int[]> pq){ for(int[] a : pq) p(a); }
    public void p(){ System.out.println("---------------------------"); }
}
