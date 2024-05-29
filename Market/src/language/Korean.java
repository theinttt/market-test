package language;

import java.util.Scanner;

public class Korean {
	
	Scanner sc = new Scanner(System.in);
	int category;
	
	public void callmethod() {
		greet();
		showmenu();
		
	}
	
	public void greet() {
		System.out.println("*******************");
		System.out.println("******* 안녕 *******");
		System.out.println("*******************");
	}
	
	public void showmenu() {
		System.out.println("     * 우리 시장의 품목 *         ");
		System.out.println("     1. 과일                   ");
		System.out.println("     2. 감기                   ");
		System.out.println("     3. 바로 먹을 수 있는 식품     ");
		System.out.println("     4. 야채                   ");
		
		System.out.println("* 구매하고 싶은 종류를 선택하세요 *");
		category = sc.nextInt();
		
		if (category == 1) {
			fruit();
		}
	}
	
	public void fruit() {
		System.out.println("*     과일     *");
		System.out.println("***************");
		System.out.println("*    사과       *");
		System.out.println("*    파인애플     *");
		System.out.println("*    주황색      *");
		System.out.println("*    수박       *");
		System.out.println("*    딸기       *");
		System.out.println("*    포도       *");
	}
}
