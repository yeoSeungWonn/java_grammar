package java_grammar;

import java.util.*;

abstract class Calculator{
	protected int a, b;
	abstract protected int calc();
	protected void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요>>");
		
		a = scan.nextInt();
		b = scan.nextInt();
		
	}
	public void run() {
		input();
		System.out.print("계산된 값은 "+ calc());
	}

}

class Adder extends Calculator{
	protected int calc() {
		return a+b;
	}
}

class Subtracter extends Calculator{
	protected int calc() {
		return a-b;
	}
}
public class App {

	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		
		adder.run();
		sub.run();
	}
	
}
