package mytest;

import java.util.Scanner;
public class Count1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int input = sc.nextInt();
			String b = Integer.toBinaryString(input);
//			System.out.println(i.toString());
			int count = 0;
			for(int i=0; i<b.length(); i++){
				if(b.charAt(i)=='1'){
					count+=1;
				}
			}
			System.out.println(count);
		}
	}
}
