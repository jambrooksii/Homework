package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;

        for(int multipleOf = 1; multipleOf <= 1000; multipleOf++){
                if(multipleOf % 5 == 0  || multipleOf % 3 ==0){

                    sum = sum + multipleOf;
                }
        }

        System.out.println(sum);
    }
}
