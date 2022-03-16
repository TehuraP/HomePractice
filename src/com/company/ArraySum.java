package com.company;

public class ArraySum {
    public static void main(String[] args) {
        int[] sumOfTheArray = {30, 567, 78, 334};
        int sum = 0;

        for (int i = 0; i < sumOfTheArray.length; i++) {
            sum += sumOfTheArray[i];
        }
        System.out.println(sum);

        int array2 [][] = new int [10][10];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }




    }
}
