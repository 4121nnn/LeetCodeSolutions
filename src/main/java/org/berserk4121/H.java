package org.berserk4121;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class H {
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
    public static void p(PriorityQueue<int[]> pq){
        for(int[] a : pq) p(a);
    }
    public static void p(){ System.out.println("---------------------------"); }

}
class A{
    public static void main(String[] args) {

    }
}

