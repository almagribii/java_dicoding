package com.dicoding.array;

public class InisiasiArray {
//    Di java hanya terdapat 2 cara penulisan yang Array yang diperbolhekan
    void cobaArray(){
//        Cara Pertama
        double[] arrA = new double[10];

//        Cara yang kedua
        double arrB[] = new double[10];

    }
    int a;

    public static void main(String[] args) {
        int[] arrInt = new int[6];

        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        arrInt[3] = 4;
        arrInt[4] = 5;
        arrInt[5] = 6;

        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);


        int[] arrInte = {1, 2, 3, 4, 5, 6};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

//        contoh tipe data primitif yang akan error ketika dia gak di inisiasi

        InisiasiArray ini = new InisiasiArray();

        System.out.println("" + ini.a);
    }
}
