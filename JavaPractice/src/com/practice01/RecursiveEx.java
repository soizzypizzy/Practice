package com.practice01;

import java.util.Scanner;

public class RecursiveEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
		System.out.print("양의 정수를 입력하세요. : ");
		n = sc.nextInt();
		} while(n <= 0);
		
		System.out.println("1부터 "+ n +"까지의 합계 : " + sum(n));
		System.out.println(n + " 팩토리얼(" + n + "!) : " + factorial(n));
		System.out.print(n + "개의 피보나치 수열 : ");
		for(int i = 1; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}
	
	// 합계
	static int sum(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}
	
	// 팩토리얼
	static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	// 피보나치 수열
	static int fibonacci(int n) {
		if(n == 1||n == 2) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	

}
