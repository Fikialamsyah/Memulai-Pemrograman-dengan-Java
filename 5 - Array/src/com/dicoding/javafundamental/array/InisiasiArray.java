package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {
        // inisiasi array
        int[] arrInt = {1,2,3,4,5,6};

        // akses array
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        // looping array
        for (int i = 0; i <= arrInt.length; i++){
            System.out.println(i);
        }
    }
}
