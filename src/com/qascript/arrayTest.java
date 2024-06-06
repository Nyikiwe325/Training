package com.qascript;
import java.util.Arrays;

public class arrayTest {
    public static void main(String[] args) {

        int arrNum[] = {20,10,3,5,14,9,7,13};
        Arrays.sort(arrNum);
        System.out.println("Length of the arry is:"+ arrNum.length);
        System.out.println("sorted array" + Arrays.toString(arrNum) );
    }
}
