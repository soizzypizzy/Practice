package com.practice01;

import java.util.Scanner;

//2차원 배열 지그재그로 숫자 채우기
public class ArraysZigZg {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("생성할 배열의 크기 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		// 숫자 넣기
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = cnt++;
				}
			} else {
				for(int j = n - 1; j >= 0; j--) {
					arr[i][j] = cnt++;
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
