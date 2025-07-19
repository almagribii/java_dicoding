package com.dicoding.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 2, 3, 4, 5};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);

        int[] arrInt2 = new int[1000000];

        for (int x = 0; x < arrInt2.length; x++) {
            arrInt2[x] = x + 1;
            System.out.println(arrInt2[x]);
        }
    }
}
