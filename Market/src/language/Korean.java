package language;

public class Korean {
	
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
	}
}
