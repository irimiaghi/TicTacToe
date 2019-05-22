package com.company;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] myArray = {2, 0, 0, 5, 0, 0, 22, 13};

        System.out.println(Arrays.toString(myArray));

        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != 0) {
                myArray[count] = myArray[i];
                count++;
            }
        }


        for (int i = count; i < myArray.length; i++) {
            myArray[i] = 0;
        }

        System.out.println(Arrays.toString(myArray));
    }
}