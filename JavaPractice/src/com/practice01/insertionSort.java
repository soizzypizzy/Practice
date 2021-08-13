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
		
		insertionAsc(arr, n);
	}

	private static void insertionAsc(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j-1] > tmp; j--) {
				a[j] = a[j-1];
			}
			a[j-1] = tmp;
		}
	}

	private static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
