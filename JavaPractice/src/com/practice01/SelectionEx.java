package com.practice01;

import java.util.Scanner;

public class SelectionEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		print(arr);
		
		// 오름차순 정렬
		selectionAsc(arr, n);
		print(arr);
		
		// 내림차순 정렬
		selectionDesc(arr, n);
		print(arr);
		
	}
	
	static void selectionDesc(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			int max = i;
			for(int j = i+1; j < n; j++) {
				if(a[j] > a[max]) {
					max = j;
				}
			}
			swap(a, i, max);
		}
	}
	
	static void selectionAsc(int[] a, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, i, min);
		}
	} 
	
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
