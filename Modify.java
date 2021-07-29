package chapter6;

import java.util.*;

public class Modify {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		StringBuffer sb;
		while(true) {
			System.out.print(">>");
			s = scan.nextLine();
			sb = new StringBuffer(s);
			
			if(s.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
		
		int index = (int) (Math.random()*s.length());	
		while(true) {
			int i = (int) (Math.random()*26);
			char c =(char) ('a'+i);
			if(!sb.equals(c)) {
				sb.replace(index, index+1, Character.toString(c));
				break;
			}
		}
		System.out.println(sb);
		}
		scan.close();
	}
}