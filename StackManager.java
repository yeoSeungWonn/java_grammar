package java_grammar;

import java.util.*;

interface StackInterface{
	int length();//스택에 있는 문자열 개
	String pop();//스택의 톱 있는 문자열 
	boolean push(String ob);//스택의 톱에 문자열 ob푸시 삽
}

class StringStack implements StackInterface{
	String[] stack = new String[5];
	private int count = 0;
	public int length() {
		return count+1;
	}
	public String pop() {
		return stack[--count];
	}
	public boolean push(String ob) {
		if(count == 5) {
			return false;
		}
		else {
			stack[count] = ob;
			count++;
			return true;
		}
	}
}

public class StackManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringStack s = new StringStack();
		
		System.out.print(">>");
		for(int i=0; i<5; i++) {
			s.push(scan.next());
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(s.pop()+" ");
		}
		
		scan.close();
	}

}
