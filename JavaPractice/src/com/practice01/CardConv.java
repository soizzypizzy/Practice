package com.practice01;

import java.util.Scanner;

// 10진수를 2진수 16진수로
public class CardConv {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정수 입력 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		int c;
		do {
			System.out.print("변환할 진수 입력 (2 또는 16) : ");
			c = sc.nextInt();
		}while(c != 2 && c != 16);
		
		char[] dchar = new char[32];
		int dno = cardConv(n, c, dchar);
		
		// 거꾸로 거슬러 올라가기 때문**
		for(int i = dno - 1; i >= 0; i--) {
			System.out.print(dchar[i]);
		}
	}
	
	static int cardConv(int n, int c, char[] d) {
		int digit = 0;
		String dchar = "0123456789ABCDEF";
		
		while(n > 0) {
			d[digit++] = dchar.charAt(n % c);
			n /= c;
		}
		
		return digit;
	}

}
