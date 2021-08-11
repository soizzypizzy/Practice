package com.practice01;

import java.util.Scanner;

public class BubbleEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("배열의 크기 입력 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("arr[" + i +"] : ");
			arr[i] = sc.nextInt();
		}
		
		print(arr);
		
		System.out.println("올림차순 정렬");
		bubbleAsc(arr, n);
		
		print(arr);
		
		
		System.out.println("내림차순 정렬");
		bubbleDesc(arr, n);
		
		print(arr);
		
		
	}
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	static void bubbleAsc(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = n -1; j > i; j--) {
				if(a[j] < a[j-1]) {
					swap(a, j, j-1);
				}
			}
		}
	}
	
	static void bubbleDesc(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = n-1; j > i; j--) {
				if(a[j] > a[j-1]) {
					swap(a, j, j-1);
				}
			}
		}
		
	}
	
	static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
