package mytest;

import java.util.Scanner;
public class PassWord{
	public static boolean Length(int length){
		return length>8 ? true:false;
	}
	
	public static boolean charType(String str){
		int lowercase = 0;
		int uppercase = 0;
		int number = 0;
		int others =0 ;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				lowercase=1;
			}else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				uppercase=1;
			}else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				number=1;
			}else{
				others=1;
			}
		}
		int total=lowercase+uppercase+number+others;
		return total<3 ? false:true;
	}
	
	public static boolean Repeat(String str){
		for(int i=0; i<str.length()-2; i++){
			String s=str.substring(i, i+3);
			if(str.substring(i+1).contains(s)){
				return false;
			}
		}return true;
	}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
        String str = sc.nextLine();
        int length=str.length();
        if(!Length(length)){
        	System.out.println("NG");
        }else if(charType(str) && Repeat(str)){
        	System.out.println("OK");
        }else{
        	System.out.println("NG");
        }

    }
}
}