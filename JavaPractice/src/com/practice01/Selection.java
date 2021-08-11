package com.practice01;

import java.util.Scanner;

public class Selection {
	
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
		
		//올림차순
		selectAsc(arr, n);
		print(arr);
		
		//내림차순
		selectDesc(arr, n);
		print(arr);
		
	}
	
	static void selectAsc(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i+1; j < n; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
	
	static void selectDesc(int[] arr, int n) {
		for(int i = 0; i < n-1; i++) {
			int max = i;
			for(int j = i+1; j < n; j++) {
				if(arr[max] < arr[j]) {
					max = j;
				}
			}
			swap(arr, i, max);
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
