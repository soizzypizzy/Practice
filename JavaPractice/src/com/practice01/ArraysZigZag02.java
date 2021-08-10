package com.practice01;

import java.util.Scanner;

public class ArraysZigZag02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("배열의 크기를 입력하세요. : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		// 숫자 넣기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[j][i] = cnt++;
			}
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-------------------");
		int cnt02 = 1;
		
		// 숫자 입력
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					arr[j][i] = cnt02++;
				}
			} else {
				for(int j = n - 1; j >= 0; j--) {
					arr[j][i] = cnt02++;
				}
			}
		}
		
		// 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
