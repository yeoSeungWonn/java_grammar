package java_grammar;

import java.util.*;
public class upDownGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		int ans;
		int num1=101;
		int num2=1;
		int small=0;
		int big=99;
		
		while(true){
			ans = rand.nextInt(100);
			System.out.println("Up & Down 게임입니다.숨겨진 수를 맞추어 보세요.");
			
			while(num1!=ans){
				System.out.println(small+"~"+big);
				System.out.print(num2+">>");
				num1 = scanner.nextInt();
				
				if(num1>ans){
					System.out.println("더 낮게");
				}
				else if(num1<ans){
					System.out.println("더 높게");
				}
				else{
					System.out.println("맞았습니다");
					break;
				}
				num2++;
			}
			System.out.println("다시 하시겠습니까(y/n)>>");
			
			if(scanner.next().equals("n")) {
				break;
			}
			small=0;
			big = 99;
			num1=101;
			num2=1;
			
	}
		scanner.close();
}
}