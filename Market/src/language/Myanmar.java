package language;

import java.util.Scanner;

public class Myanmar {
	
	Scanner sc = new Scanner(System.in);
	int category;
	
	public void callmethod() {
		greet();
		showmenu();
		
	}
	
	public void greet() {
		System.out.println("*******************");
		System.out.println("****** မဂ်လာပါ ******");
		System.out.println("*******************");
	}
	
	public void showmenu() {
		System.out.println("*ကျွန်ုပ်တို့ Market တွင်ရှိသောပစ္စည်းများ*");
		System.out.println("     ၁. အသီးအနှံများ           ");
		System.out.println("     ၂. အအေးများ             ");
		System.out.println("     ၃. အသင့်စားအစားအစာများ     ");
		System.out.println("     ၄. ဟင်းသီးဟင်းရွက်များ       ");
		
		System.out.println("မိမိဝယ်ယူလိုသောအမျိူးအစားကိုရွေးပါ");
		category = sc.nextInt();
		
		if (category == 1) {
			fruit();
		}
	}

	public void fruit() {
		System.out.println("*   အသီးအနှံများ   *");
		System.out.println("***************");
		System.out.println("*   ပန်းသီး       *");
		System.out.println("*   နာနတ်သီး      *");
		System.out.println("*   လိမ္မော်သီး      *");
		System.out.println("*   ဖရဲသီး        *");
		System.out.println("*   စတော်ဘယ်ရီ    *");
		System.out.println("*   စပျစ်သီး       *");
	}
}
