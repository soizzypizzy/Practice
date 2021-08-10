package com.practice01;

import java.util.Scanner;

// charAt()을 활용한 반전 문자열
public class Mirror {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요. : ");
		String s = sc.nextLine();
		
		/*
		StringBuilder m = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			m.append(s.charAt(i));
		}
		
		System.out.println(m);
		*/
		
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
