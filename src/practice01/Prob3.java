package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		int num = scan.nextInt();
		int sum=0;
		
		//짝수인 경우
		if(num%2==0){
			
			for(int i=2;i<=num;i+=2){
				sum+=i;
				System.out.print(i+"+");
			}
		
		}
		
		//홀수인 경우
		else{
				
				for(int i=1;i<=num;i+=2){
					sum+=i;
					System.out.println(i+"+");
				}
			}
		
		//출력
			System.out.println();
			System.out.println("sum="+sum);
		
		}
		
	
	}
