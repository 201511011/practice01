package practice01;

import java.util.Scanner;

public class Prob55 {
	public static void main(String[] args) {
		System.out.print("값을 입력:");
		Scanner scan = new Scanner(System.in);
		int m=scan.nextInt();
		for(int i=1;i<m;i++){
			
			String s= String.valueOf(i);
			int len = s.length();
			System.out.print(i+"   ");
			//십 이상의 자릿 수
			for(int r=2;r<=len;r++){
				if(len==r){
	//				십의 자리 숫자
	//				if(s.charAt(0)=='3'||s.charAt(0)=='6'||s.charAt(0)=='9'){
	//					System.out.print("짝");
	//				}
	//				if(s.charAt(1)=='3'||s.charAt(1)=='6'||s.charAt(1)=='9'){
	//					System.out.print("짝");
	//				}
	//				System.out.println();
					for(int k=0;k<len;k++){
						if(s.charAt(k)=='3'||s.charAt(k)=='6'||s.charAt(k)=='9'){
							System.out.print("짝");
						}
					}
					System.out.println();
				}
			}
			//일의 자리
			if(len==1){
				
				if(s.charAt(0)=='3'||s.charAt(0)=='6'||s.charAt(0)=='9'){
					System.out.print("짝");
				}
				System.out.println();
		
			}
				
			}
		}
	}

