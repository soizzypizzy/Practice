package com.practice01;

import java.util.Scanner;

public class Recursive {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정수 n 입력 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		System.out.println("팩토리얼 : " + facto(n));
		int[] fibonacci = new int[n];
		for(int i = 0; i < n; i++) {
			fibonacci[i] = fibo(i + 1);
			System.out.printf("%d ", fibonacci[i]);
		}
		System.out.println();
		System.out.println("총 합 : " + sum(n));
	}
	
	// 재귀함수 - 팩토리얼
	static int facto(int n) {
		
		if(n == 1) {
			return 1;
		} else {
			return n * facto(n - 1);
		}
	}
	
	// 피보나치
	static int fibo(int n) {
		if(n == 1 || n == 2) {
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
	
	// 총 합
	static int sum(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

}
