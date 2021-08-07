package com.practice01;

import java.util.Scanner;

public class IDNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmpId;
		do {
			System.out.print("주민등록번호 13자리를 - 없이 입력하세요. : ");
			tmpId = sc.nextLine();
			if(tmpId.length()!=13) {
				System.out.println("잘못된 입력입니다.");
			}
		} while(tmpId.length() != 13);
		
		long id = Long.parseLong(tmpId);
		int[] idArr = new int[13];
		int[] chk = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i = 0; i < 13; i++) {
			idArr[12 - i] = (int)(id % 10);
			id /= 10;
			if(12 - i != 12) {
				sum += idArr[12 - i] * chk[12 - i];
			}
		}
		
		int res = 11 - (sum % 11);
		
		if(res == idArr[12]) {
			System.out.println("올바른 주민등록번호 정보입니다.");
		} else {
			System.out.println("잘못된 주민등록번호 정보입니다.");
		}
		
	}
}
