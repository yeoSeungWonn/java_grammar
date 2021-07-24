package java_grammar;

import java.util.*;

class Phone{
	 String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}
public class PhoneManager {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("인원수>>");
		int num = scan.nextInt();
		Phone[] Arr = new Phone[num];
		
		for(int i=0; i<Arr.length; i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			Arr[i] = new Phone(scan.next(), scan.next());
		}
		System.out.println("저장되었습니다...");
		
		System.out.print("검색할 이름>>");
		String srcName = scan.next();
			
		for(int i=0; i<num; i++) {
			if(srcName.equals("exit")) {
				System.out.println("프로그램을 종료니다...");
				break;
				}
			else if(srcName.equals(Arr[i].getName())) {
				System.out.println(Arr[i].getName()+"의 번호는 "+Arr[i].getTel()+" 입니다.");
				}
			else if((!srcName.equals(Arr[i].getName())&& i==(num-1))){
				System.out.println(srcName+"이(가)없습니다.");
				}
			}
		scan.close();
	}
}
