package com.tests;

import org.testng.annotations.Test;


public class Test123 {

    @Test
    public void numbers() {
        int[] numbers = {45,23,78,12,56,90};
        for(int i=0;i<numbers.length;i++) {
            System.out.println("avaialble numbers are : " +numbers[i]);
        }
    }
}
