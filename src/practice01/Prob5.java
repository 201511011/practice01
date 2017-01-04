//반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보세요.
//1부터 99까지만 실행하세요.


package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=1;i<=99;i++){
			System.out.print(i+"  ");
			int ten=i/10;
			int one=i%10;
			
			//십의 자리수가 3,6,9인 경우
			if(ten==3||ten==6||ten==9){//if(ten!=0&&ten%3==0){
				System.out.print("짝");
			}
			
			//일의 자리수가 3,6,9인 경우
			if(one==3||one==6||one==9){ //if(one!=0 && one%3==0){
				System.out.print("짝");
			}
			
			System.out.println();
 		}
	}
}
