package com.practice01;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정수를 입력하세요. : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		print(arr);
		
		// 오름차순
		insertionAsc(arr, n);
		print(arr);
		
		// 내림차순
		insertionDesc(arr, n);
		print(arr);
	}

	private static void insertionDesc(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j-1] < tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}

	private static void insertionAsc(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j] = tmp;
		}
	}

	private static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
}
