package practice01;

public class Prob4 {
	public static void main(String[] args) {
		//String Method Test
		String s ="Hello World";
		System.out.println(s.length());
		for(int k=0;k<=s.length();k++){
			
			for(int i=0;i<k;i++){
			System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}
}
