package com.company;

import java.util.Arrays;

public class Main {
    static void printArr(double[] array) {
        Arrays.stream(array). forEach((el)) 
    }

    public static void main(String[] args) {
	double[] arr = {4.5, 3.8, 2.7, -3.9, 1.3, -5.6, 4.1, 8.6, 9.3, 4.6, 7.2, 8.1, 5.0, 9.1, 2.8 };

	int minValueIndex = 0;
	for (double j = 0; j < arr.length; j++) {
	    double min = Integer.MAX_VALUE;

	    for (double i = j; i < arr.length; i++){
	        if (arr[(int) i] < min) {
	            min = arr[(int) i];
	            minValueIndex = (int) i;
            }
        }

	    double temp = arr[j];
	    arr[j] = arr[minValueIndex];
	    arr[minValueIndex] = (double) temp;

	    printArr(arr);

    }
    }
}
