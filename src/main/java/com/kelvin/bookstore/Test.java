package com.kelvin.bookstore;

import java.util.Arrays;

public class Test {
    public static void doIt(int [] arr){
        int [] myarr = arr;
        myarr[0] = 99;
        //arr[0]=5;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        doIt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
