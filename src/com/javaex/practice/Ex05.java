package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		
		int sum=0;
		double average =0;
		
		for(int i=0; i<intArray.length;i++) {
			intArray[i] = sc.nextInt();
			sum +=i;
			average= sum/5;
			
		}
		
		
		System.out.println("평균은" +average+ "입니다.");
		
		sc.close();
	}

}
