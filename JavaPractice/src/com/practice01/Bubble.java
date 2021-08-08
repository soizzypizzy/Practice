package com.practice01;

import java.util.Scanner;

public class Bubble {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("생성할 배열의 크기를 입력하세요(양의 정수) : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("올림차순 정렬");
		bubbleAsc(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println("\n내림차순 정렬");
		bubbleDesc(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
	}
	
	static void bubbleDesc(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j] > a[j - 1]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
	}

	static void bubbleAsc(int[] a, int n) {
		for(int i = 0 ; i < n-1; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j] < a[j-1]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
	}

}
