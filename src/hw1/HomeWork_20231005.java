package hw1;

public class HomeWork_20231005 {

	public static void main(String[] args) {
		
//請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println("題目一:");
		int a =12, b =6;
		System.out.println("12+6=" + (a+b));
		System.out.println("12x6=" + (a*b));
		System.out.println();
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		System.out.println("題目二:");
		int egg =200;
		System.out.println("200顆蛋是" + (egg/12) + "打" + (egg%12)+"顆");
		System.out.println();
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		System.out.println("題目三:");
		int sec =256559;
		int min = sec/60;
		int hrs = min/60;
		int day = hrs/24;
		System.out.println(sec+"是" + day + "天" + (hrs%24)+"時"+ (min%60) +"分"+ (sec%60)+"秒");
		System.out.println();
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		System.out.println("題目四:");
		final double PI =3.1415;
		double r = 5;
		System.out.println("半徑"+ r + "圓面積"+ r*r*PI);
		System.out.println("半徑"+ r + "圓周長"+ r*2*PI);
		System.out.println();
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		System.out.println("題目五:");
		double orgMoeny = 150*10000;
		double interestRate= 0.02;
		int year = 10;
		//複利公式s=p(1+i)^n
		double yearRate = 1.02* 1.02* 1.02* 1.02* 1.02* 1.02* 1.02* 1.02* 1.02* 1.02; 
		
		System.out.print("150萬，複利2%，10年後本金+利息=");	
		System.out.println(orgMoeny*yearRate + "元");
		System.out.println("即約"+ (int)(orgMoeny*yearRate/10000)+"萬" + (int)(orgMoeny*yearRate%10000) + "元");
		System.out.println();
/*請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
 *5 + 5
 *5 + ‘5’
 *5 + “5”
 *並請用註解各別說明答案的產生原因
 */
		System.out.println("題目六:");
		System.out.print("5 + 5 = ");
		System.out.println(5 + 5 );//數值+數值=運算數值
		
		System.out.print("5 + '5' = ");
		System.out.println(5 + '5');//字元'5'的Unicode=35，所以5+35=38
		
		System.out.print("5 + \"5\" = ");		
		System.out.println(5 + "5");//字串"5"與數值相加，會執行字串相接，呈現兩個5→55
	}
}
